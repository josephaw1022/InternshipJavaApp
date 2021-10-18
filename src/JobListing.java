package src;

import java.util.ArrayList;

 public class JobListing {
     private String id;
     private String jobTitle;
     private String companyName;
     private String jobDescription;
     private ArrayList<String> prefferedQuals;
     private ArrayList<String> requiredQuals;
     private boolean isOpen;
     private double rating;
     
     public JobListing() {

     }
     public JobListing(String id, String companyName, String jobDescription, ArrayList<String> requiredQuals, ArrayList<String> prefferedQuals) {

     }

     public JobListing getJob(String id){
         //TODO
	return new JobListing();

     }

     public double getRaiting(){
         //TODO
	return 0.0;
     }
     public void sendInterestMEssage(String studentID){
       
     }
 }
