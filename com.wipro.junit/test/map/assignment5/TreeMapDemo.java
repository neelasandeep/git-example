package map.assignment5;

import java.util.ArrayList;
import java.util.TreeMap;

public class TreeMapDemo {
	 TreeMap<String,String> hm=new TreeMap<>();
	    
	    
	    // adding given countryName and capital to the Map
	    public <E> TreeMap<String, String> saveCountryCapital(String countryName,String capital){
	    	
	    	hm.put(countryName,capital);
	    	return hm;
	    }
	    
	    //Getting capital using countryName
	    public String getCapital(String countryName) {
	    	String capital="Not Found";
	    	 capital=hm.get(countryName);
	    	return capital;
	    }
	    
	    //Getting countryName using capital
	    public String getCountryName(String capital) {
	    	
	    	for(Object country:hm.keySet()) {
	    		if(hm.get(country).equals(capital)) {
	    			return (String)country;
	    		}
	    	}
	    	return "Not Found";
	    }
	    
	   //returning Map with reverse values
	    public <E> TreeMap<String,String> reverseMap(){
	    	TreeMap<String,String> m2=new TreeMap<>();
	    	for(Object o:hm.keySet()) {
	    		m2.put( hm.get(o),(String)o);
	    	}
	    	return m2;
	    	
	    }
	    
	    //Returning ArrayList with key values
		public <E> ArrayList<String> returnkeys(){
			ArrayList<String> al=new ArrayList<>();
			for(Object o:hm.keySet()) {
				al.add((String)o);
			}
			return al;
		}

}
