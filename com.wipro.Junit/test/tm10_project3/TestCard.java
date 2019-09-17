package tm10_project3;
import java.util.Scanner;
import java.util.TreeSet;


import java.util.HashSet;
import java.util.Iterator;
public class TestCard {
	
	public static void main(String[] args) {
		String card;
		int number;
		int count=0;
		Scanner sc=new Scanner(System.in);
		HashSet<Card> hs=new HashSet<>();
		TreeSet<Card> hs3=new TreeSet<>(Card.sortComparator);
		
		HashSet<String> hs1=new HashSet<>();
		
		
		HashSet<String> hs2=new HashSet<>();
		hs2.add("a");
		hs2.add("b");
		hs2.add("c");
		hs2.add("d");
		
		while(!(hs1.containsAll(hs2))) {
			count++;
				System.out.println("Enter a card");
		card=sc.next();
		number=sc.nextInt();
		Card e=new Card(card,number);
		hs.add(e);
		Iterator<Card> itr=hs.iterator();
		while(itr.hasNext()) {
			Card c=itr.next();
			
			if(c.getCard().equals("a")||c.getCard().equals("b")||c.getCard().equals("c")||c.getCard().equals("d")) {
				hs1.add(c.getCard());
				hs3.add(c);
			}
		}
		
		}
		
		
		Iterator<Card> itr1=hs3.iterator();
		System.out.println("Four Symbols gathered in "+count+" Cards\nCards in set are");
		while(itr1.hasNext()) {
			Card c1=itr1.next();
			System.out.println(c1.getCard()+" "+c1.getNumber());
		}
		sc.close();
	}

}
