package set.assignment4;
import java.util.TreeSet;
import java.util.Iterator;
public class Assignment4 {
	TreeSet<String> H1=new TreeSet<>();
    public  <E> TreeSet<String> SaveCountryNames(String countryName) {
 	   H1.add(countryName);
 	   return  H1;
    }
    public String getCountryNames(String country) {
 	   Iterator<String> itr=H1.iterator();
 	   while(itr.hasNext()) {
 		   if(itr.next().equalsIgnoreCase(country))
 			   return country;
 	   }
 	 
 	   return null;
    } 
	public static void main(String[] args) {
		Assignment4 ths=new Assignment4();
		TreeSet<String> ts;
		ts=ths.SaveCountryNames("india");
		ts=ths.SaveCountryNames("America");
		ts=ths.SaveCountryNames("Russia");
		ts=ths.SaveCountryNames("Germany");
		ts=ths.SaveCountryNames("Malasia");
		System.out.println(ts);
		System.out.println("Finding ccountry name");
		System.out.println(ths.getCountryNames("India".toLowerCase()));
		System.out.println(ths.getCountryNames("China".toLowerCase()));
		System.out.println(ths.getCountryNames("america".toLowerCase()));

	}
}



