package assertmethods.assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		Demo2 demo=new Demo2();
		assertEquals(false,demo.palindromeCheck("sandeep"));
		assertTrue("Result: ",demo.palindromeCheck("mom"));
		assertTrue("Result: ",demo.palindromeCheck("madam"));
		assertFalse("Result: ",demo.palindromeCheck("india"));
		
			
		
	}

}
