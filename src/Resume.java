
import java.util.ArrayList;

public class Resume {
  private String id;
  private ArrayList<ResumeExperience> workExp;
  private ArrayList<String> skills;
  private ArrayList<String> currentClasses;
  /**
   * calls and assign the  strings and the array lists 
   */
  public Resume() {
    this.workExp = new ArrayList<ResumeExperience>();
    this.skills = new ArrayList<String>();
    this.currentClasses = new ArrayList<String>();
  }
  /**
   * creates the resume constructor 
   * @param id
   * @param workExp
   * @param skills
   * @param currentClasses
   */
  public Resume(String id, ArrayList<ResumeExperience> workExp, ArrayList<String> skills, ArrayList<String> currentClasses) {
    this.id = id;
    this.workExp = workExp;
    this.skills = skills;
    this.currentClasses = currentClasses;
  }
  /**
   * adds skill to the arraylist 
   * @param skill
   */
  public void addSkill(String skill) {
    skills.add(skill);
  }
  /**
   * adds class to the array list
   * @param className
   */
  public void addClass(String className) {
    currentClasses.add(className);
  }
	
}
