import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {

	public static ArrayList<Employee> loadEmployees() {
		ArrayList<Employee> employees = new ArrayList<>();
	    
		try {
		  FileReader reader = new FileReader(EMPLOYEE_FILE_NAME);
		  JSONParser parser = new JSONParser();	
		  JSONArray employeesJSON = (JSONArray)parser.parse(reader);
		    
		  for(int i=0; i < employeesJSON.size(); i++) {
		    JSONObject employeeJSON = (JSONObject)employeesJSON.get(i);
		    String id = (String)employeeJSON.get(USER_ID);
		    String userName = (String)employeeJSON.get(USER_USER_NAME);
		    String password = (String)employeeJSON.get(USER_PASSWORD);
		    String firstName = (String)employeeJSON.get(USER_FIRST_NAME);
		    String lastName = (String)employeeJSON.get(USER_LAST_NAME);
		    String email = (String)employeeJSON.get(USER_EMAIL);
		    String phoneNumber = (String)employeeJSON.get(USER_PHONE_NUMBER);	
		    String companyName = (String)employeeJSON.get(EMPLOYEE_COMPANY_NAME);	
		    String jobTitle = (String)employeeJSON.get(EMPLOYEE_JOB_TITLE);	
		    employees.add(new Employee(id, firstName, lastName, userName, password, email, phoneNumber, companyName, jobTitle));
		    }
		    
		    return employees;
		    
		    } catch (Exception e) {
		    e.printStackTrace();
		     }
		return null;
		}
	public static ArrayList<Admin> loadAdmins() {
		ArrayList<Admin> admins = new ArrayList<>();
	    
		try {
		  FileReader reader = new FileReader(ADMIN_FILE_NAME);
		  JSONParser parser = new JSONParser();	
		  JSONArray adminsJSON = (JSONArray)parser.parse(reader);
		    
		  for(int i=0; i < adminsJSON.size(); i++) {
		    JSONObject adminJSON = (JSONObject)adminsJSON.get(i);
		    String id = (String)adminJSON.get(USER_ID);
		    String userName = (String)adminJSON.get(USER_USER_NAME);
		    String password = (String)adminJSON.get(USER_PASSWORD);
		    String firstName = (String)adminJSON.get(USER_FIRST_NAME);
		    String lastName = (String)adminJSON.get(USER_LAST_NAME);
		    String email = (String)adminJSON.get(USER_EMAIL);
		    String phoneNumber = (String)adminJSON.get(USER_PHONE_NUMBER);	
		    admins.add(new Admin(id, firstName, lastName, userName, password, email, phoneNumber));
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
      FileReader reader = new FileReader(STUDENT_FILE_NAME);
      JSONParser parser = new JSONParser();	
      JSONArray studentsJSON = (JSONArray)parser.parse(reader);
	
      for(int i=0; i < studentsJSON.size(); i++) {
	//parsing basic user info
        JSONObject studentJSON = (JSONObject)studentsJSON.get(i);
	String id = (String)studentJSON.get(USER_ID);
	String userName = (String)studentJSON.get(USER_USER_NAME);
	String password = (String)studentJSON.get(USER_PASSWORD);
	String firstName = (String)studentJSON.get(USER_FIRST_NAME);
	String lastName = (String)studentJSON.get(USER_LAST_NAME);
	String email = (String)studentJSON.get(USER_EMAIL);
	String phoneNumber = (String)studentJSON.get(USER_PHONE_NUMBER);
        //parsing education object
	JSONArray educationArray = (JSONArray)studentJSON.get(STUDENT_EDUCATION);
	for(int j=0; i < educationArray.size(); j++) {
	  JSONObject studentEducation = (JSONObject)educationArray.get(i);
	  String schoolName = (String)studentEducation.get(STUDENT_SCHOOL_NAME);
	  String degree = (String)studentEducation.get(STUDENT_DEGREE);
	  String major = (String)studentEducation.get(STUDENT_MAJOR);
	  double gpa = (double)studentEducation.get(STUDENT_GPA);
	  Education educationObject = new Education(schoolName, degree, major, gpa);
	}


	students.add(new Student(id, firstName, lastName, userName, password, email, phoneNumber));
	}
	
	return students;
	 
	} catch (Exception e) {
	e.printStackTrace();
 	}
    return null;
    }
    public static void main(String[] args) {
      AdminList adminList = AdminList.getInstance();
      String id = UUID.randomUUID().toString();
      String studentPhone = "8881234567";
      adminList.addAdmin(id, "jackson", "trigiani", "jacktrig", "password", "jacktrig@gmail.com", studentPhone); 
      adminList.logout();

      StudentList studentList = StudentList.getInstance();
      UUID studentID = UUID.randomUUID();
      studentList.addStudent( "jackson", "trigiani", "jacktrig", "password", "jacktrig@gmail.com", studentPhone); 
      
    }
}
