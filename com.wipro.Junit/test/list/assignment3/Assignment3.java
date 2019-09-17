package list.assignment3;
import java.util.ArrayList;
import java.util.Iterator;
public class Assignment3 {
	
	public static void main(String[] args) {
		ArrayList<String> arraylist=new ArrayList<>();
		arraylist.add("food");
		arraylist.add("play");
		arraylist.add("shelter");
		arraylist.add("health");
		arraylist.add("human");
		arraylist.add("energy");
		Assignment3 asn=new Assignment3();
		asn.printAll(arraylist);
	}
	
	public void printAll(ArrayList<String> al) {
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
