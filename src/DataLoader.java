import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {

	public static ArrayList<Admin> loadAdmins() {
		ArrayList<Admin> admins = new ArrayList<>();
	    
		try {
		  FileReader reader = new FileReader(USER_FILE_NAME);
		  JSONParser parser = new JSONParser();	
		  JSONArray adminsJSON = (JSONArray)parser.parse(reader);
		    
		  for(int i=0; i < adminsJSON.size(); i++) {
		    JSONObject adminJSON = (JSONObject)adminsJSON.get(i);
		    String userName = (String)adminJSON.get(USER_USER_NAME);
		    String password = (String)adminJSON.get(USER_PASSWORD);
		    String firstName = (String)adminJSON.get(USER_FIRST_NAME);
		    String lastName = (String)adminJSON.get(USER_LAST_NAME);
		    String email = (String)adminJSON.get(USER_EMAIL);
		    String phoneNumber = (String)adminJSON.get(USER_PHONE_NUMBER);	
		    admins.add(new Admin(firstName, lastName, userName, password, email, phoneNumber));
		    }
		    
		    return admins;
		    
		    } catch (Exception e) {
		    e.printStackTrace();
		     }
		return null;
		}
	     
  public static ArrayList<Student> loadStudents() {
    ArrayList<Student> students = new ArrayList<>();

    try {
      FileReader reader = new FileReader(USER_FILE_NAME);
      JSONParser parser = new JSONParser();	
      JSONArray studentsJSON = (JSONArray)parser.parse(reader);
	
      for(int i=0; i < studentsJSON.size(); i++) {
        JSONObject studentJSON = (JSONObject)studentsJSON.get(i);
	String userName = (String)studentJSON.get(USER_USER_NAME);
	String password = (String)studentJSON.get(USER_PASSWORD);
	String firstName = (String)studentJSON.get(USER_FIRST_NAME);
	String lastName = (String)studentJSON.get(USER_LAST_NAME);
	String email = (String)studentJSON.get(USER_EMAIL);
	String phoneNumber = (String)studentJSON.get(USER_PHONE_NUMBER);	
	String major = (String)studentJSON.get(USER_MAJOR);
	students.add(new Student(firstName, lastName, userName, password, email, phoneNumber, major));
	}
	
	return students;
	
	} catch (Exception e) {
	e.printStackTrace();
 	}
    return null;
    }
    public static void main(String[] args) {
      StudentList studentList = StudentList.getInstance();
      String studentPhone = "8881234567";
      UUID studentID = UUID.randomUUID();
      studentList.addStudent( "jackson", "trigiani", "jacktrig", "password", "jacktrig@gmail.com", studentPhone , "comp sci"); 
      
    }
}
