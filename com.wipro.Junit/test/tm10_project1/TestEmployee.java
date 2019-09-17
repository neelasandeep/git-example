package tm10_project1;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
   
	public static void main(String[] args) {
		AddEmployee ae=new AddEmployee();
		ArrayList<Employee> al=new ArrayList<>();
		al=ae.addEmployee();
		 
		Collections.sort(al, Employee.EmpNameComparator);
		 System.out.printf("%-15s%-15s%-15s%-30s%-15s","FirstName","LastName","Mobile","Email","Address");
		 System.out.println();
		 for(Employee str: al){
			 System.out.printf("%-15s%-15s%-15s%-30s%-15s",str.getFirstName(),str.getLastName(),str.getPhoneNumber(),str.getEmail(),str.getAddress());
		System.out.println();
		 }


	}

}
