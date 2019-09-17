package tm10_project1;

import java.util.Comparator;

public class Employee {
String firstName;
String lastName;
String email;
String phoneNumber;
String address;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public static Comparator<Employee> EmpNameComparator = new Comparator<Employee>() {

	public int compare(Employee s1, Employee s2) {
	   String StudentName1 = s1.getFirstName().toUpperCase();
	   String StudentName2 = s2.getFirstName().toUpperCase();

	   //ascending order
	   return StudentName1.compareTo(StudentName2);

	   //descending order
	   //return StudentName2.compareTo(StudentName1);
   }};





}
