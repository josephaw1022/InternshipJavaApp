
import java.util.ArrayList;

public class Resume {
  private String id;
  private ArrayList<ResumeExperience> workExp;
  private ArrayList<String> skills;
  private ArrayList<String> currentClasses;

  public Resume() {
    this.workExp = new ArrayList<ResumeExperience>();
    this.skills = new ArrayList<String>();
    this.currentClasses = new ArrayList<String>();
  }
  
  public Resume(String id, ArrayList<ResumeExperience> workExp, ArrayList<String> skills, ArrayList<String> currentClasses) {
    this.id = id;
    this.workExp = workExp;
    this.skills = skills;
    this.currentClasses = currentClasses;
  }
  
  public void addSkill(String skill) {
    skills.add(skill);
  }

  public void addClass(String className) {
    currentClasses.add(className);
  }
	
}
