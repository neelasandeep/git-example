package testSuite;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
 Calc c=null;
	@Before
	public void before() {
		 c=new Calc();
	}
	@Test
	public void testAdd() {
		assertEquals(5,c.add(10,-5));
		assertEquals(100,c.add(95,5));
		assertEquals(5,c.add(12,-7));
		assertEquals(5,c.add(14,-9));
		
	}

	@Test
	public void testSub() {
		assertEquals(5,c.sub(10,5));
		assertEquals(95,c.sub(100,5));
		assertEquals(5,c.sub(12,7));
		assertEquals(5,c.sub(14,9));
	}

}
