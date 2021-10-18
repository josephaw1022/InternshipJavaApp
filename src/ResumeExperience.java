package src;

import java.util.ArrayList;

 public class ResumeExperience {
     private String companyName;
     private String experienceLocation;
     private String positionTitle;
     private String datesOfExperience;
     private ArrayList<String> experienceDetails;

     public ResumeExperience(String experienceTitle, String experienceLocation, String positionTitle, String datesOfExperience){

     }

     public ArrayList<String> addExperienceDetail(String detailDescription){
       return new ArrayList<>();
     }

     public boolean removeExperienceDetail(String detailDescription){
       return true;
     }
 }