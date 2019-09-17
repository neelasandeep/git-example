package list.assignment2;

public class Employee {
int empId;
String empName;
String email;
String gender;
float salary;
public Employee(int empId, String empName, String email, String gender, float salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.email = email;
	this.gender = gender;
	this.salary = salary;
}
public void getEmployeeDetails() {
	
	
	System.out.printf("%-6d%-10s%-30s%-10s%.1f", empId,empName,email,gender,salary);
	System.out.println();
	
}
}
