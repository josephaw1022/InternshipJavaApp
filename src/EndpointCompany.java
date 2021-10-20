import java.util.ArrayList;
import java.util.*;

public class EndpointCompany {
  private ArrayList<Employee> list;

  public void create(Employee company) {
    this.list.add(company);
  }

  /**
   * @return Employee
   */
  public Employee readDetail(UUID id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list.get(i).id == id) {
        return this.list.get(i);
      }
    }
    return new Employee();
    
  }

  /**
   * @return Company[]
   */
  public ArrayList<Employee> readList() {
    return this.list;
  }

  public void update(Employee employee) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list.get(i).id == employee.id) {
        employee = this.list.get(i); 
      }
    }
  }

  public void delete(UUID id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list.get(i).id == id) {
        this.list.remove(i);
      }
    }

  }

}
