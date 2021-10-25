import java.util.UUID;

public abstract class User {
  protected UUID id;
  protected String firstName;
  protected String lastName;
  protected String username;
  protected String password;
  protected String email;
  protected int phone;
  
  protected User() {

  }

  public User(UUID id, String firstName, String lastName, String username, String password, String email, int phone) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.email = email;
    this.phone = phone;
  }

 

  public boolean checkUnique(String username, String password, String email, int phone) {
    //TODO - possibly needs to be moved to UserEndpoint
    return true;
  }
  
  protected boolean changePassword(String oldPassword, String newPassword) { //may need to move this method
    if(oldPassword == this.password) {
      this.password = newPassword;
      return true;
    }
    
    return false;
  }
}