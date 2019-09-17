package tm10_project4;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Cardtest {

	public static void main(String[] args) {
		int n;
		String card;
		int number;
		ArrayList<Card> al=new ArrayList<>();
		Map<String,Integer> mp=new TreeMap<>();
		System.out.println("Enter number of Cards");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter Card "+i);
			card=sc.next();
			number=sc.nextInt();
			Card c=new Card(card,number);
			al.add(c);
			}
		Iterator<Card> itr=al.iterator();
		while(itr.hasNext()) {
			Card c1=itr.next();
			String str=c1.getCard();
			if(mp.containsKey(str)) {
				mp.put(str,mp.get(str)+1);
			}else {
				mp.put(str, 1);
			}
		}
		System.out.println("Distinct Symbols are ");
		for(Object o:mp.keySet()) {
			System.out.print(o+" ");
		}
		for(Object o:mp.keySet()) {
			int sum=0;
		System.out.println("\nCards in "+o+" Symbol ");
		Iterator<Card> itr1=al.iterator();
		while(itr1.hasNext()) {
		Card c1=itr1.next();
		
		if(o.equals(c1.getCard())) {
			sum+=c1.getNumber();
			System.out.println(c1.getCard()+" "+c1.getNumber());
			
		}
		}
		System.out.println("Number of Cards "+mp.get(o));
		System.out.println("Sum of Numbers "+sum);
		}
    sc.close();
	}

}
