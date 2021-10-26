/**
 * @author Jordan Hennings
 */

import java.util.ArrayList;
import java.util.UUID;

public class Student extends User {
    private ArrayList<Education> educations;
    private ArrayList<Resume> resumes;
    private ArrayList<ResumeExperience> experiences;
    private ArrayList<Review> reviews;
    
    public Student() {
      
    }

    public Student(String id,
                   String firstName,
                   String lastName,
                   String username,
                   String password,
                   String email,
                   String phone
                  ) {
      super(id, firstName, lastName, username, password, email, phone);
      this.educations = new ArrayList<>();           
      this.resumes = new ArrayList<>();
      this.reviews = new ArrayList<>();
    }

    public void addEducation(Education education) {
      this.educations.add(education);
    }

    public void addResume(Resume resume) {
      this.resumes.add(resume);
    }
    public void addResumeExperience(ResumeExperience experience) {
      this.experiences.add(experience);
    }

    public Resume createResume(String id, ArrayList<ResumeExperience> workExp, ArrayList<String> skills, ArrayList<String> currentClasses) {
      Resume newResume = new Resume(id, workExp, skills, currentClasses);
      resumes.add(newResume);
      return newResume;
    }

    public Review addReview(User writer, String comment, double score) {
      Review newReview = new Review(writer, comment, score);
      reviews.add(newReview);
      return newReview;  
    }
}