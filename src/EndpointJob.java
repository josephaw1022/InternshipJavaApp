package src;

import java.util.ArrayList;


public class EndpointJob{ 
    
    private ArrayList<JobListing> list ; 

    public void create(){

    }

    
    /** 
     * @return Job
     */
    public JobListing readDetail(){ 
      return new JobListing();
    }

    
    /** 
     * @return Job[]
     */
    public JobListing[] readList() {
<<<<<<< HEAD
      return new JobListing[2];
=======
      return new JobListing[2];  
>>>>>>> 85b38b4a26574b23508ad06bcc8362c582f31b6f
    }

    public void update(){ 

    }
    
    public void delete(){

    }

}