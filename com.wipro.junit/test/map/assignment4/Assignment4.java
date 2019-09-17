package map.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment4 {

	public static void main(String[] args) {
		HashMap<String,String> contactList=new HashMap<>();
		contactList.put("Sandeep", "9515746150");
		contactList.put("Ram", "7515746150");
		contactList.put("Ramesh", "9575542150");
		contactList.put("Rahul", "9717758150");
		contactList.put("Sudha", "8545242150");
		System.out.println("Does Ram Exists as key or not"+contactList.containsKey("Ram"));
		System.out.println("Does 9515746150 Exists or not"+contactList.containsValue("9525746150"));
		System.out.println("Does Rama Exists as key or not"+contactList.containsKey("Rama"));
		Set<Entry<String, String>> set=contactList.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+" = "+m.getValue());
		}
		

	}

}
