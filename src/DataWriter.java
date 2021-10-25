import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
	
	
	public static void savePeople() {
		StudentList studentList = StudentList.getInstance();
		ArrayList<Student> students = studentList.getStudentList();
		JSONArray studentsJSON = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< studentsJSON.size(); i++) {
			studentsJSON.add(getStudentJSON(students.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
 
            file.write(studentsJSON.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static JSONObject getStudentJSON (Student student) {
		JSONObject studentDetails = new JSONObject();
		studentDetails.put(USER_FIRST_NAME, student.getFirstName());
		studentDetails.put(USER_LAST_NAME, student.getLastName());
		studentDetails.put(USER_PHONE_NUMBER, student.getPhoneNumber());
        
        return studentDetails;
	}
}