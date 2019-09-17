package map.assignment3;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Assignment3 {
	 public static void main(String args[]) {
	      Properties capitals = new Properties();
	      Set states;
	      String str;
	      
	      capitals.put("Tealangana", "Hyderabad");
	      capitals.put("Goa", "Panaji");
	      capitals.put("Maharastra", "Mumbai");
	      capitals.put("WestBengal", "Kolkata");
	      capitals.put("Karnataka", "Benguluru");

	      // Show all states and capitals in hashtable.
	      states = capitals.keySet();   // get set-view of keys
	      Iterator itr = states.iterator();
	      
	      while(itr.hasNext()) {
	         str = (String) itr.next();
	         System.out.println("The capital of " + str + " is " + 
	            capitals.getProperty(str) + ".");
	      }     
	      System.out.println();

	      // look for state not in list -- specify default
	      str = capitals.getProperty("AndhraPradesh", "Not Found");
	      System.out.println("The capital of AndhraPradesh is " + str + ".");
	   }

}
