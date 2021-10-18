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
      return new JobListing[2];  
    }

    public void update(){ 

    }
    
    public void delete(){

    }

}