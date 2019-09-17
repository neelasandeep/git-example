package assertmethods.assignment1;

import java.util.ArrayList;

public class Employee {

	public String findname(ArrayList <String> employees,String name) {
		String result="";
		if(employees.contains(name)) {
			result="Found";
		}
		else {
			result="Not Found";
		}
		return result;
	}
}
