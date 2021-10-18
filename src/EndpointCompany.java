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
<<<<<<< HEAD
      return new Company[2]; 
=======
      return new Company[1];
>>>>>>> 85b38b4a26574b23508ad06bcc8362c582f31b6f
    }

    public void update(){ 

    }
    
    public void delete(){

    }

}
