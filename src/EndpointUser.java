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
      return new Student[2];
    }

    public void update(){ 

    }
    
    public void delete(){

    }

}