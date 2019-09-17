package SerialAndDeserial;
import java.util.Date;
import java.io.Serializable;
public class Employee implements Serializable{
	String name;
	Date DateOfbirth;
	String Department;
	String Destination;
	Double salary;
	public Employee(String name, Date dateOfbirth, String department, String destination, Double salary) {
		
		this.name = name;
		DateOfbirth = dateOfbirth;
		Department = department;
		Destination = destination;
		this.salary = salary;
	}
	public Employee() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfbirth() {
		return DateOfbirth;
	}
	public void setDateOfbirth(Date dateOfbirth) {
		DateOfbirth = dateOfbirth;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

}
