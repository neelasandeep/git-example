package list.assignment6;
import java.util.Iterator;
import java.util.Vector;
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Vector<String> al=new Vector<>();
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