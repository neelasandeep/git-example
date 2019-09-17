package tm05.project1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class VideoTest{
private String name;
private int rate;

public VideoTest(String name, int rate) {
	super();
	this.name = name;
	this.rate = rate;
}

Video v=null;
  @Before
  public void before() {
	  v=new Video(this.name);
  }
  @Parameters
  public static Collection <Object[]> generate(){
	  Object[][] data=new Object[][] {
		  {"sandeep",5},{"ram",7}
	  };
	  return Arrays.asList(data);
  }
	@Test
	public void testGetVideoName() {
		
		assertEquals("result",this.name,v.getVideoName());
		
	}

	@Test
	public void testGetRating() {
		v.recieveRating(this.rate);
		assertEquals("result",this.rate,v.getRating());
	}

	@Test
	public void testRecieveRating() {
		v.recieveRating(this.rate);
		assertEquals("result",this.rate,v.getRating());
	}

	
	@Test
	public void testDoCheckOut() {
		v.doCheckOut();
		assertTrue(v.getCheckOut());
	}

	@Test
	public void testDoReturn() {
		v.doReturn();
		assertFalse(v.getCheckOut());
	}

	@Test
	public void testGetCheckOut() {
		v.doCheckOut();
		assertTrue(v.getCheckOut());
	}

}
