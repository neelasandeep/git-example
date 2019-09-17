package tm07;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class AddEmployee {
	
	ArrayList<Employee1> al=new ArrayList<>();
	
	Scanner sc=new Scanner(System.in);
	public ArrayList<Employee1> addemployee() {
		Employee1 e1=new Employee1();
		
		try {
	System.out.println("Enter Employee Id");
	int id=sc.nextInt();
	
	e1.setId(id);
	System.out.println("Enter Employee name");
	String name=sc.next();
	e1.setName(name);
	System.out.println("Enter Employee age");
	int age=sc.nextInt();
	 while(age<0||age>150) {
	      	System.out.println("  please enter Valid age");
	      	age=sc.nextInt();
	      	
	      }
	e1.setAge(age);
	System.out.println("Enter Employee salary");
	double salary=sc.nextDouble();
	e1.setSalary(salary);
	al.add(e1);
	System.out.println("Employee information succesfully added");
		}catch(InputMismatchException e) {
			System.out.println("InputMismatchException occurred");
			return null;
		}
	
	
	
	return al;
	}

}
