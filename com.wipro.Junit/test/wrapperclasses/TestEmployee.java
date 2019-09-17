package wrapperclasses;

public class TestEmployee {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp=new Employee("Sandeep","1234");
		System.out.println(emp.name+" "+emp.id);
		Employee emp2=emp.clone();
		emp2.name="Ram";
		System.out.println(emp.name+" "+emp.id);
		System.out.println(emp2.name+" "+emp2.id);

	}

}
class Employee implements Cloneable{
	public String name;
	public String id;
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Employee clone() throws CloneNotSupportedException{
		return (Employee)super.clone();
	}
	
}

