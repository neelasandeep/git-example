package tm10_project2;

import java.util.ArrayList;
import java.util.Iterator;

public class Items {
	ArrayList<String> al=new ArrayList<>();
public int insertItems(String item) {
	if(al.add(item)) {
		return 1;
	}
	return 0;
	
}
public int searchItem(String item) {
	
   if( al.contains(item)) {
	   return 1;
   }
	return 0;
}
public int deleteItem(String item) {
	if(al.contains(item)) {
		al.remove(item);
		return 1;
	}
	return 0;
}
public void displayItems() {
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
