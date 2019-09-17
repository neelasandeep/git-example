package list.assignment7;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class TestEmployee2 {

	public static void main(String[] args) {
		Vector<Employee2> al1=new Vector<>();
		
		al1.add(new Employee2(101,"Sandeep","nelasandeep199@gmail.com",30000f));
		al1.add(new Employee2(102,"Sudha","sai199@gmail.com",30000f));
		al1.add(new Employee2(103,"Sowmya","nelasowmya199@gmail.com",30000f));
		al1.add(new Employee2(104,"aruna","nelaaruna199@gmail.com",30000f));
		al1.add(new Employee2(105,"chandra","nelashekar199@gmail.com",30000f));
		Iterator<Employee2> itr=al1.iterator();
		System.out.println("Using Iterator()");
		while(itr.hasNext()) {
			itr.next().printAll();
		}
		System.out.println("Using Enumeration()");
		Enumeration<Employee2> enumeration=Collections.enumeration(al1);
		while(enumeration.hasMoreElements()) {
			enumeration.nextElement().printAll();
		}

	}

}
