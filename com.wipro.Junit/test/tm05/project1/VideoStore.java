package tm05.project1;

public class VideoStore {

	  Video[] store;
	  
	 
	public void addVideo(String name) {
		int store1;
		if(store==null) {
		store1=0;}else {
			store1=store.length;
		}
		Video v=new Video(name);
		Video[] v1=new Video[store1+1];
		v1[store1]=v;
		 store=v1;
		
	}
	public void doCheckOut(String name) {
		for( Video video:store) {
			if(video.getVideoName().equals(name))
				video.doCheckOut();
		}
		
		
	}
	public void doReturn(String name) {
		for( Video video:store) {
			if(video.getVideoName().equals(name))
				video.doReturn();
		}
		
	}
	public void receiveRating(String name,int rating) {
		for(Video video:store) {
			if(video.getVideoName().equals(name)) {
				
				video.recieveRating(rating);
			}
		}
			
		    
			
	}
	public void listInventory() {
		for( Video video:store) {
			System.out.println("---------------------------------------------------------");
			System.out.printf("%-20s|%-20s|%-20s","Video name","Checkout Status","Rating");
			System.out.println();
				System.out.printf("%-20s|%-20s|%-20s",video.getVideoName(),video.getCheckOut(),video.getRating());
				System.out.println();
				System.out.println("-----------------------------------------------------");
				
				System.out.println("\n");
		}
		
	}
}
