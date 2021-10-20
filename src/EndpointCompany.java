import java.util.ArrayList;

public class EndpointCompany {
  private ArrayList<Company> list;

  public void create(Company company) {
    this.list.add(company);
  }

  /**
   * @return Company
   */
  public Company readDetail(int id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i] == id) {
        return this.list[i];
      }
    }
  }

  /**
   * @return Company[]
   */
  public Company[] readList() {
    return this.list;
  }

  public void update(Company company) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i] == company.id) {
        this.list[i] =  company  
      }
    }
  }

  public void delete(int id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i].id == id) {
        this.list.remove(i);
      }
    }

  }

}
