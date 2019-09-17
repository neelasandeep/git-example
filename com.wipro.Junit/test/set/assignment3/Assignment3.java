package set.assignment3;

import java.util.Iterator;
import java.util.TreeSet;

public class Assignment3 {
	 public void reverseSet(TreeSet<String> hs) {
		 TreeSet<String> rhs=(TreeSet<String>) hs.descendingSet();
		 System.out.println("After reversing");
			Iterator<String> itr1=rhs.iterator();
			while(itr1.hasNext()) {
				System.out.println(itr1.next());
			}
			
	 }
	
	
	public static void main(String[] args) {
		TreeSet<String> hs=new TreeSet<>();
		hs.add("Sandeep");
		hs.add("Ramesh");
		hs.add("kishore");
		hs.add("mahesh");
		
		System.out.println("Before reversing");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Assignment3 as=new Assignment3();
		as.reverseSet(hs);
		System.out.println("Does name rahul exist in the TreeSet? "+hs.contains("rahul"));
		System.out.println("Does name sandeep exist in the TreeSet? "+hs.contains("Sandeep"));
				
		

	}

}
