package set.assignment2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;



public class Assignment2 {

	public static void main(String[] args) {
		String[] emp= {"Sandeep","ram","ramesh","venu","Chandrashekar","Aruna"};
		HashSet<String> hs=new HashSet<>(Arrays.asList(emp));
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
