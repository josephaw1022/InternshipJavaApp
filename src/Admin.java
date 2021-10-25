import java.util.UUID;

public class Admin extends User {
    //need String id and String phone
    public Admin(UUID id, String firstName, String lastName, String username, String password, String email, String phone) {
      super(id, firstName, lastName, username, password, email, phone);
    }
    private boolean removeAccount(String id){
      return true;
    }

    private String resetPassword(String id){
      return "string";
    }

    private void hideReview(){
      
    }
}
