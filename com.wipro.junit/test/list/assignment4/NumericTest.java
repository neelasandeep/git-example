package list.assignment4;
import java.util.ArrayList;
import java.util.Iterator;
public class NumericTest {

	public static void main(String[] args) {
		ArrayList<Numeric> al=new ArrayList<>();
		al.add(new Numeric(10,10.5f,234567890));
		al.add(new Numeric(56,15.5f,1000004433));
		al.add(new Numeric(17,10.5f,1000065500));
             Iterator<Numeric> itr=al.iterator();
             while(itr.hasNext()) {
            	 itr.next().printAll();
             }

		   
	}

}
