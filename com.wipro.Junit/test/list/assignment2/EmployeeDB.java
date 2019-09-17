package list.assignment2;
import java.util.ArrayList;
import java.util.Iterator;


public class EmployeeDB {
	ArrayList<Employee> al=new ArrayList<>();
	boolean addEmployee(Employee e) {
		al.add(e);
		return true;
	}
	boolean deleteEmployee(int empID) {
		for(Employee e:al) {
			if(e.empId==empID) {
				al.remove(e);
				return true;
			}
		}
		return false;
	}
	public String showPaySlip(int empID) {
		for(Employee e:al) {
			if(e.empId==empID) 
				return "This is the Payslip for EmpId:"+empID;
				
		}
		
		return "there is no employee with that EmpID";
		
	}
	public static void main(String[] args) {
		ArrayList<Employee> al1=new ArrayList<>();
		EmployeeDB e1=new EmployeeDB();
		e1.addEmployee(new Employee(101,"Sandeep","nelasandeep199@gmail.com","male",30000f));
		e1.addEmployee(new Employee(102,"Sudha","sai199@gmail.com","female",30000f));
		e1.addEmployee(new Employee(103,"Sowmya","nelasowmya199@gmail.com","female",30000f));
		e1.addEmployee(new Employee(104,"aruna","nelaaruna199@gmail.com","female",30000f));
		e1.addEmployee(new Employee(105,"chandra","nelashekar199@gmail.com","male",30000f));
		al1=e1.al;
		Iterator<Employee> itr = al1.iterator();
		System.out.println("before deleting employees");
	      while(itr.hasNext()) {
	         
	    	  itr.next().getEmployeeDetails();
	      }
        e1.deleteEmployee(102);
		System.out.println("after deleting employees");
		 itr = al1.iterator();
		while(itr.hasNext()) {
		itr.next().getEmployeeDetails();
		}
		
		System.out.println("\n"+e1.showPaySlip(105));
		System.out.println("\n"+e1.showPaySlip(103));
		System.out.println("\n"+e1.showPaySlip(104));
		

	}

}
