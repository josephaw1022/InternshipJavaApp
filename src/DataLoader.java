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
      JSONArray studentsJSON = (JSONArray)new JSONParser().parse(reader);
	
      for(int i=0; i < studentsJSON.size(); i++) {
        JSONObject studentJSON = (JSONObject)studentsJSON.get(i);
        UUID id = UUID.fromString((String)studentJSON.get(USER_ID));
	String userName = (String)studentJSON.get(USER_USER_NAME);
	String password = (String)studentJSON.get(USER_PASSWORD);
	String firstName = (String)studentJSON.get(USER_FIRST_NAME);
	String lastName = (String)studentJSON.get(USER_LAST_NAME);
	String email = (String)studentJSON.get(USER_EMAIL);
	int phoneNumber = ((Long)studentJSON.get(USER_PHONE_NUMBER)).intValue();	
	String major = (String)studentJSON.get(USER_MAJOR);
	students.add(new Student(id, firstName, lastName, userName, password, email, phoneNumber, major));
	}
	
	return students;
	
	} catch (Exception e) {
	e.printStackTrace();
 	}
    return null;
    }
}
