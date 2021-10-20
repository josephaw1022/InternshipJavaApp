/**
 * @author Jordan Hennings
 */
import java.util.ArrayList;


public class ApplicationManager {
    private ArrayList<JobListing> listings;
    private ArrayList<Company> companies;
    private ArrayList<Admin> administrators;
    private ArrayList<Student> students;

    public ApplicationManager() {
        listings = new ArrayList<JobListing>();
        companies = new ArrayList<Company>();
        administrators = new ArrayList<Admin>();
        students = new ArrayList<Student>();
    }

    public boolean loginAccount(String username, String password) {
      return true;
    }

    public String getUserID() {
      return "string";
    }

    public String getJobListingID() {
      return "string";
    }

    public Resume getResume() {
      return new Resume();
    }

    public Company searchCompany(String companyName) {
      return new Company();
    }

    public JobListing searchJobListing(JobListing jobListing) {
      return new JobListing();
    }

    public JobListing searchJobListing(String keyword) {
      return new JobListing();
    }

    public User searchUsers(String id) {
      return new Student();
    }

    public void addStudent(User user) {
    
    }

    public void addCompany(User user) {

    }

    public void addAdministrator(User user) {

    }

    public void addJobListin(JobListing jobListing) {

    }

    public boolean removeJobListing(JobListing jobListing) {
      return true;
    }

}