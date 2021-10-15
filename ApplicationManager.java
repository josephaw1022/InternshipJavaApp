/**
 * @author Jordan Hennings
 */

 
import java.util.ArrayList;


public class ApplicationManager {
    private ArrayList<JobListing> listings;
    private ArrayList<Company> companies;
    private ArrayList<Administrator> administrators;
    private ArrayList<Student> students;

    public ApplicationManager() {
        listings = new ArrayList<JobListing>();
        companies = new ArrayList<Company>();
        administrators = new ArrayList<Administrator>();
        students = new ArrayList<Student>();
    }

    public boolean loginAccount(String username, String password) {

    }

    public String getUserID() {

    }

    public String getJobListingID() {

    }

    public Resume getResume() {

    }

    public Company searchCompany(String companyName) {

    }

    public JobListing searchJobListing(JobListing jobListing) {

    }

    public JobListing searchJobListing(String keyword) {

    }

    public User searchUsers(String id) {

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

    }

}