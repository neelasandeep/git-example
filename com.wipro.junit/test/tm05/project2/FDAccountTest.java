package tm05.project2;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
public class FDAccountTest {
private double amount;
private int noOfDays;
private int age;
	public FDAccountTest(double amount, int noOfDays, int age) {
	super();
	this.amount = amount;
	this.noOfDays = noOfDays;
	this.age = age;
}

	@Parameters
	public static Collection <Object[]> generate(){
		Object[][]data =new Object[][] {
			{10000,65,45},{10000,89,90},{10000,45,45}
		};
		return Arrays.asList(data);
	}
	FDAccount fd=null;
	@Before
	public void before() {
		fd=new FDAccount();
		
	}
	@Test
	public void testCalculateInterest() {
		fd.setAmount1(this.amount);
		fd.setAge1(this.age);
		fd.setNoOfDays(this.noOfDays);
		
		fd.calculateInterest();
	}

	@Test
	public void testGetAmount1() {
			
	
	fd.setAmount1(this.amount);
	
	
	}

	@Test
	public void testSetAmount1() {
		fd.setAmount1(this.amount);
		
	}

	@Test
	public void testGetAge1() {
		fd.setAge1(this.age);
		
	}
	@Test
	public void testSetAge1() {
		fd.setAge1(this.age);
		
	}

	@Test
	public void testGetNoOfDays() {
		fd.setNoOfDays(this.noOfDays);
		
	}

	@Test
	public void testSetNoOfDays() {
		fd.setNoOfDays(this.noOfDays);
		
	}

}
