package tm10_project1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import tm10_project1.Employee;
public class AddEmployee {
	Scanner sc=new Scanner(System.in);
	
	ArrayList<Employee> al=new ArrayList<>();
	public <E>ArrayList<Employee> addEmployee() {
		
		System.out.println("Enter The Number of Employees");
		int number=sc.nextInt();
		while(number<1) {
			System.out.println("Enter valid input");
			number=sc.nextInt();
		}
		try {
		for(int i=1;i<=number;i++) {
			Employee e=new Employee();
			System.out.println("Enter Employee "+i+" Details");
			System.out.println("Enter First Name");
			
			e.setFirstName(sc.next());
			System.out.println("Enter last Name");
			
			e.setLastName(sc.next());
			System.out.println("Enter Mobile Number");
			
			e.setPhoneNumber(sc.next());
			System.out.println("Enter email");
			
			e.setEmail(sc.next());
			System.out.println("Enter address");
			e.setAddress(sc.next());
			al.add(e);
		}
		}catch(InputMismatchException e) {
			System.out .println("InputMismatchException occurred");
		}
		
		 
		return al;
	}
	}
	
