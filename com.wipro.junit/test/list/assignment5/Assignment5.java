package list.assignment5;

import java.util.Iterator;
import java.util.LinkedList;
public class Assignment5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> al=new LinkedList<>();
      al.add("JANUARY");
      al.add("FEBRAURY");
      al.add("MARCH");
      al.add("APRIL");
      al.add("MAY");
      al.add("JUNE");
      al.add("JULY");
      al.add("AUGUST");
      al.add("SEPTEMBER");
      al.add("OCTOBER");
      al.add("NOVEMBER");
      al.add("DECEMBER");
     Iterator<String> itr=al.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
	}


}
