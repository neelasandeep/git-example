package list.assignment7;

public class Employee2 {
int empId;
String empName;
String email;
double salary;
public Employee2(int empId, String empName, String email, double salary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.email = email;
	this.salary = salary;
}
public void printAll() {
	System.out.printf("%-6d%-10s%-30s%.1f", empId,empName,email,salary);
	System.out.println();
}
}
