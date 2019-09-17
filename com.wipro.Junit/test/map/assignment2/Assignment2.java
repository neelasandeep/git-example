package map.assignment2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Assignment2 {
	
	
	public static void main(String[] args) {
		
		HashMap<Object,Object> hm=new HashMap<>();
		hm.put(new String("India"), new String("Delhi"));
		hm.put(new String("Bat"), new String("Ball"));
		hm.put(new String("Basket"), new String("Fruits"));
		hm.put(new String("Employee"), new String("Salary"));
		
		System.out.println("Does Fruis Exists as value? "+hm.containsValue("Fruis"));
		System.out.println("Does Fruits Exists as value? "+hm.containsValue("Fruits"));
		System.out.println("Does Bat Exists as kay? "+hm.containsKey("Bat"));
		System.out.println("Does Ball Existsas key? "+hm.containsKey("Ball"));
		//Iterator
		System.out.println("\n******Map elements using Iterator*****");
		Set set=hm.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Entry)itr.next();
			System.out.println(m.getKey()+" = "+m.getValue());
		}

	}

}
