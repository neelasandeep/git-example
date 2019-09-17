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
public class SBAccountTest {
	SBAccount sb=null;
	private double interestRate;
	private double amount;

	public SBAccountTest(double interestRate, double amount) {
		super();
		this.interestRate = interestRate;
		this.amount = amount;
	}
@Parameters
public static Collection<Object[]>  generate(){
	Object[][] data=new Object[][] {
		{4,10000},{6,10000}
	};
	return Arrays.asList(data);
}
@Before
public void before() {
	 sb=new SBAccount();
}
	@Test
	public void testCalculateInterest() {
		sb.setAmount(this.amount);
		sb.setInterestRate(this.interestRate);
		sb.calculateInterest();
		
	}

	@Test
	public void testGetInterestRate() {
		sb.setInterestRate(this.interestRate);
		assertEquals(this.interestRate,sb.getInterestRate(),this.interestRate+0.5);
	}

	@Test
	public void testSetInterestRate() {
		sb.setInterestRate(this.interestRate);
		assertEquals(this.interestRate,sb.getInterestRate(),this.interestRate+0.5);
	}

	@Test
	public void testGetAmount() {
		sb.setAmount(this.amount);
		assertEquals(this.amount,sb.getAmount(),this.amount+10);
	}

	@Test
	public void testSetAmount() {
		sb.setAmount(this.amount);
		assertEquals(this.amount,sb.getAmount(),this.amount+10);
	}

}
