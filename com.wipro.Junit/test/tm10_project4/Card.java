package tm10_project4;

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
}
