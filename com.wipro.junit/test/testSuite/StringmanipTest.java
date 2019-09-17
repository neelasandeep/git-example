package testSuite;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringmanipTest {
	private String datum;
	private String expected;
	public StringmanipTest(String datum,String expected) {
		this.datum=datum;
		this.expected=expected;
	}
	@Parameters
	  public static Collection <Object[]> generatedata(){
		  Object[][] data=new Object[][]{{"smitha","SMITHA"},{"Smitha","SMITHA"},{"sMITHA","SMITHA"}};
		  return Arrays.asList(data);
	  }
	  

	@Test
	public void testStringmanip() {
		Stringmanip s=new Stringmanip(this.datum);
		String actual=s.uppercase();
		assertEquals(actual,this.expected);
	}

}
