package map.assignment5;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Iterator;



public class TestTreeMap {

	public static void main(String[] args) {
		TreeMapDemo hmd=new TreeMapDemo();
		TreeMap<String,String> hm=new TreeMap<>();
		hm=hmd.saveCountryCapital("India", "Delhi");
		hm=hmd.saveCountryCapital("Japan", "Tokyo");
		hm=hmd.saveCountryCapital("America", "Washington, D.C");
		System.out.println("Map values:\n");
		 for(Object o:hm.keySet()) {
        	 System.out.println((String)o+" = "+hm.get(o));
         }
		
       System.out.println("The capital name for India is "+hmd.getCapital("India"));
      
       System.out.println("The countryName name for capital Delhi is "+hmd.getCountryName("Delhi"));
       System.out.println("\n******reversing keys and values********\n");
         hm= hmd.reverseMap();
         for(Object o:hm.keySet()) {
        	 System.out.println((String)o+" = "+hm.get(o));
         }
         System.out.println("\n******keys as arrayList*******\n");
         ArrayList<String> al=new ArrayList<>();
         al=hmd.returnkeys();
         Iterator<String> itr=al.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }

	}

}
