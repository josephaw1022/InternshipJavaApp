import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
  
  public static ArrayList<Student> getStudents() {
    ArrayList<Student> students = new ArrayList<>();
    try {
      FileReader reader = new FileReader(USER_FILE_NAME);
      JSONParser parser = new JSONParser();	
      JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
	
      for(int i=0; i < peopleJSON.size(); i++) {
        JSONObject personJSON = (JSONObject)peopleJSON.get(i);
        UUID id = UUID.fromString((String)personJSON.get(USER_ID));
	String userName = (String)personJSON.get(USER_USER_NAME);
	String password = (String)personJSON.get(USER_PASSWORD);
	String firstName = (String)personJSON.get(USER_FIRST_NAME);
	String lastName = (String)personJSON.get(USER_LAST_NAME);
	String email = (String)personJSON.get(USER_EMAIL);
	int phoneNumber = ((Long)personJSON.get(USER_PHONE_NUMBER)).intValue();	
	String major = (String)personJSON.get(USER_MAJOR);
	students.add(new Student(id, firstName, lastName, userName, password, email, phoneNumber, major));
	}
	
	return students;
	
	} catch (Exception e) {
	e.printStackTrace();
 	}
    return null;
    }
}
