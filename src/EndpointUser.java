import java.util.ArrayList;

public class EndpointUser {

  private ArrayList<User> list;

  public void create(User user){
      this.list.add(user)
    }

  /**
   * @return User
   */
  public User readDetail(int id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i] == id) {
        return this.list[i];
      }
    }
  }

  /**
   * @return User[]
   */
  public User[] readList() {
    return this.list;
  }

  public void update(User user ){ 
      for (int i = 0; i < this.list.size(); i++) {
        if (this.list[i] == user.id) {
          this.list[i] =  company  
        }
      }
    }

  public void delete(int id ) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i].id ==id) {
        this.list.remove(i);
      }
    }
  }

}