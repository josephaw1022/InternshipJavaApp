import java.util.ArrayList;

public class EndpointUser {

  private ArrayList<User> list;

  public static void create(User user){
      this.list.add(user)
    }

  /**
   * @return User
   */
  public static User readDetail(String id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i].id == id) {
        return this.list[i]
      }
    }
  }

  /**
   * @return User[]
   */
  public static User[] readList() {
    return this.list;
  }

  public static void update(User user ){ 
      for (int i = 0; i < this.list.size(); i++) {
        if (this.list[i].id == user.id) {
          this.list[i] =  company  
        }
      }
    }

  public static void delete(String id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list[i].id == id) {
        this.list.remove(i);
      }
    }
  }

}