package set.assignment1;
import java.util.HashSet;
import java.util.Iterator;
public class TestHashSet {
       HashSet<String> H1=new HashSet<>();
       public  <E> HashSet<String> SaveCountryNames(String countryName) {
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
		TestHashSet ths=new TestHashSet();
		HashSet<String> ts;
		ts=ths.SaveCountryNames("India");
		ts=ths.SaveCountryNames("America");
		ts=ths.SaveCountryNames("Russia");
		ts=ths.SaveCountryNames("Germany");
		ts=ths.SaveCountryNames("Malasia");
		System.out.println(ts);
		System.out.println(ths.getCountryNames("India".toLowerCase()));
		System.out.println(ths.getCountryNames("China".toLowerCase()));
		System.out.println(ths.getCountryNames("america".toLowerCase()));

	}

}
