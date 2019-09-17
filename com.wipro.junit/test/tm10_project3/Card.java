package tm10_project3;

import java.util.Comparator;



public class Card {
	String card;
	int number;
	public Card(String card, int number) {
		super();
		this.card = card;
		this.number = number;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public static Comparator<Card> sortComparator = new Comparator<Card>() {

		public int compare(Card s1, Card s2) {
		   String card1 = s1.getCard().toUpperCase();
		   String card2 = s2.getCard().toUpperCase();

		   //ascending order
		   return card1.compareTo(card2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	   }};


}
