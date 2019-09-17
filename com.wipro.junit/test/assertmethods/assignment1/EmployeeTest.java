package assertmethods.assignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testFindname() {
		Employee e=new Employee();
		String[] str=new String[] {"sandeep","ramu","ramya","sudha"};
		ArrayList<String> arr=new ArrayList<>(Arrays.asList(str));
		assertEquals("Found",e.findname(arr, "sandeep"));
	
	}

}
