package src;

import java.util.ArrayList; 

public class EndpointCompany {
        private ArrayList<Company> list ; 

    public void create(){

    }

    
    /** 
     * @return Company
     */
    public Company readDetail(){ 
      return new Company();
    }

    
    /** 
     * @return Company[]
     */
    public Company[] readList() {
      return new Company[1];
    }

    public void update(){ 

    }
    
    public void delete(){

    }

}
