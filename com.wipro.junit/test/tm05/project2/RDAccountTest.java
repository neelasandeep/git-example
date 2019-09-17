package tm05.project2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) 
public class RDAccountTest {

	
	private int age;
	private int noofMonths;
	private double amount;
	private double interestRate;
	RDAccount rd=null;
	
	public RDAccountTest(int age, int noofMonths, double amount) {
		super();
		this.age = age;
		this.noofMonths = noofMonths;
		this.amount = amount;
		
	}
	@Parameters
	public static Collection <Object[]> generate(){
		Object[][] data=new Object[][]{
			{43,6,10000},{65,8,10000},{76,9,10000}
		};
		return Arrays.asList(data);
	}
	@Before
	public void before() {
		rd=new RDAccount();
	}
	@Test
	public void testCalculateInterest() {
		rd.setAmount(this.amount);
		rd.setNoofMonths(this.noofMonths);
		rd.setAge(this.age);
		rd.calculateInterest();
		
	}

	@Test
	public void testGetAge() {
		rd.setAge(this.age);
		assertEquals(this.age,rd.getAge());
	}

	@Test
	public void testSetAge() {
		rd.setAge(this.age);
		assertEquals(this.age,rd.getAge());
	}

	@Test
	public void testGetNoofMonths() {
		rd.setNoofMonths(this.noofMonths);
		assertEquals(this.noofMonths,rd.getNoofMonths());
	}

	@Test
	public void testSetNoofMonths() {
		rd.setNoofMonths(this.noofMonths);
		assertEquals(this.noofMonths,rd.getNoofMonths());
	}

	@Test
	public void testGetAmount() {
		rd.setAmount(this.amount);
		assertEquals(this.amount,rd.getAmount(),this.amount);
	}

	@Test
	public void testSetAmount() {
		rd.setAmount(this.amount);
		assertEquals(this.amount,rd.getAmount(),this.amount);
	}

	

}
