package tm05.project1;

import static org.junit.Assert.*;

import org.junit.Test;

public class VideoLauncherTest {

	@Test
	public void testMain() {
		VideoStore v=new VideoStore();
		
		
		v.addVideo("marvel");
		v.doCheckOut("marvel");
		v.doReturn("marvel");
		v.receiveRating("marvel", 8);
		
		
		
	}

}
