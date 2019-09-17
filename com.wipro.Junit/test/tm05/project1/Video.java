package tm05.project1;

public class Video {
	private String videoName;
	private boolean checkout;
	private int rating;
	public Video(String name) {
		super();
		videoName=name;
	}
	public Video() {
		
	}
	public String getVideoName() {
		return videoName;
	}
	
	public int getRating() {
		return rating;
	}
	public void recieveRating(int rating) {
		this.rating = rating;
	}
	public void doCheckOut() {
		checkout=true;
	}
	public void doReturn() {
		checkout=false;
	}
	public boolean getCheckOut() {
		return checkout;
	}
	

}
