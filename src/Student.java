/**
 * @author Jordan Hennings
 */

import java.util.ArrayList;

public class Student extends User {
    private String major;
    private double GPA;
    private ArrayList<Resume> resumes;

    public Student(String major, String studentID) {
        this.major = major;
        resumes = new ArrayList<Resume>();
    }

    public String getMajor() {

    }

    public void addResume(Resume resume) {

    }

    public Resume createResume() {

    }

    public Review addReview() {
        
    }
}