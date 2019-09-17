package tm05.project1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Before;
import org.junit.Test;
@RunWith(Parameterized.class)
public class VideoStoreTest {
	private String name;
	private int rate;
     VideoStore v=null;
   
	public VideoStoreTest(String name,int rate) {
		super();
		this.name = name;
		this.rate=rate;
	}
	@Parameters
	public static Collection <Object[]> generate(){
		Object[][] data=new Object[][] {
			{"marvel infinity",8},{"Avengers",9}
		};
		return Arrays.asList(data);
	}
	@Before
	public void before() {
		v=new VideoStore();
		
	}
	@Test
	public void testAddVideo() {
		
		v.addVideo(this.name);
		v.addVideo(this.name);
		
		int size=v.store.length;
		
		 assertEquals("result",2,size);
		
	}
	
	@Test
	public void testDoCheckOut() {
		
		v.addVideo(this.name);
		
		int size=v.store.length;
		v.doCheckOut(this.name);
		
		
		 assertEquals("result",1,size);
		
	}
	
	@Test
	public void testDoReturn() {
		 v.addVideo(this.name);
		
		int size=v.store.length;
		v.doReturn(this.name);
		
		
		 assertEquals("result",1,size);
	}
	
	@Test
	public void testReceiveRating() {
		 v.addVideo(this.name);
		
			int size=v.store.length;
			v.receiveRating(this.name, this.rate);
			
			 assertEquals("result",1,size);
	}
	
}
