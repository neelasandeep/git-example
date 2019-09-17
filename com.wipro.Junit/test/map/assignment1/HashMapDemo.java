package map.assignment1;
import java.util.HashMap;
import java.util.ArrayList;

public class HashMapDemo {
    HashMap<String,String> hm=new HashMap<>();
    
    
    // adding given countryName and capital to the Map
    public <E> HashMap<String, String> saveCountryCapital(String countryName,String capital){
    	
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
    public <E> HashMap<String,String> reverseMap(){
    	HashMap<String,String> m2=new HashMap<>();
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
