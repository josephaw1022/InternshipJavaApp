import java.util.ArrayList;
import java.util.UUID;

public class EmployeeList {
  private static EmployeeList employees = null;

  private static ArrayList<Admin> employeesList = new ArrayList<>();

  private EmployeeList() {
    employeesList = DataLoader.loadEmployees();
  }
  public static EmployeeList getInstance() {
	if(employees == null) {
		employees = new EmployeeList();
	}
	return employees;
}

public ArrayList<Employee> getEmployeeList() {
	return employeesList;
}

public void addEmployee(String id, String firstName, String lastName, String userName, String password, String email, String phoneNumber) {
	employeesList.add(new Admin(id, firstName, lastName, userName, password, email, phoneNumber));
}

public void logout(){
	DataWriter.saveAdmins();
}
}