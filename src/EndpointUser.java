import java.util.ArrayList;
import java.util.*;


public class EndpointUser {

  private ArrayList<User> list;

  public void create(User user){
      this.list.add(user);
    }

  /**
   * @return User
   */
  
  public User readDetail(UUID id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list.get(i).id == id) {
        return this.list.get(i);
      }
    }
    return new Student();
  }



  /**
   * @return User[]
   */
  public ArrayList<User> readList() {
    return this.list;
  }

  public void update(User user ){ 
      for (int i = 0; i < this.list.size(); i++) {
        if (this.list.get(i).id == user.id) {
          user = this.list.get(i); 
        }
      }
    }

  public void delete(UUID id) {
    for (int i = 0; i < this.list.size(); i++) {
      if (this.list.get(i).id ==id) {
        this.list.remove(i);
      }
    }
  }

}