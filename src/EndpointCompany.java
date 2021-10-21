import java.util.ArrayList;

public class EndpointCompany {
  private ArrayList<Company> list;

  public static void create(Company company) {
    this.list.add(company);
  }

  /**
   * @return Company
   */
  public static Company readDetail(String id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i].id == id) {
        return this.list[i]
      }
    }
  }

  /**
   * @return Company[]
   */
  public Company[] readList() {
    return this.list;
  }

  public static boolean update(Company company) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i].id == company.id) {
        this.list[i] =  company  
      }
    }
  }

  public static boolean delete(String id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i].id == id) {
        this.list.remove(i);
      }
    }
  }
}
