package src;

import java.util.ArrayList;


public class EndpointUser{ 
    
    private ArrayList<User> list ; 

    public void create(){

    }

    
    /** 
     * @return User
     */
    public User readDetail(){ 
      return new Student();
    }

    
    /** 
     * @return User[]
     */
    public User[] readList() {
<<<<<<< HEAD
      return new Student[2]; 
=======
      return new Student[2];
>>>>>>> 85b38b4a26574b23508ad06bcc8362c582f31b6f
    }

    public void update(){ 

    }
    
    public void delete(){

    }

}