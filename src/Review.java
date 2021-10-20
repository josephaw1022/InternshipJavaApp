public class Review {
	private User writer;
	private String comment;
	private double rating;
        
	public Review() {
		//writer is a new student here for compiling purposes, must be fixed to accept any User
		writer = new Student();
		comment = "";
		rating = 0.0;
	}
	public Review(User writer, String comment, double score){
		this.writer = writer;

	}
   
	public User getWriter(){

		return writer;
	}
   
	public String getComment(){
        return comment;
	}
   
	public double getRating(){
		return rating;
	}
    }