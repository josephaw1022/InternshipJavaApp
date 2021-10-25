import java.util.ArrayList;

public class Employee extends User {
    private String companyName;
    private String jobTitle;
    private ArrayList<Review> reviews;

    public Employee() {
      
    }

    public Employee(String companyName, String jobTitle){
      this.companyName = companyName;
      this.jobTitle = jobTitle;
      reviews = new ArrayList<Review>(); 
    }

    public Review addStudentReview(User writer, String comment, double score){
      Review newReview = new Review(writer,comment,score);
      reviews.add(newReview);
      return newReview;
    }
    
}
