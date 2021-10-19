
import java.util.ArrayList;

public class Company {
  public String companyName;
  public String companyDescription;
  public ArrayList<String> jobPositionsAvailable;
  public ArrayList<Employee> employees;

  /**
   * adds a new employee 
   * @param employee
   */
  public void addEmployee(Employee employee) {
    employees.add(employee);
  }

  public ArrayList<Employee> getEmployees() {
	  return new ArrayList<>();
  }
	
}
