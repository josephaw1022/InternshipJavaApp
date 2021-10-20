public class Review {
	private User writer;
	private String comment;
	private double rating;
        
	public Review() {
		writer = new User();
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