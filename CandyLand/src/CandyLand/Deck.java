// Samuel Holtzman
// Keegan Dwyer
package CandyLand;
import CandyLand.Card;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private int nextCard = 0;
	
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		
	}
	
	public Card draw() {
		return deck.get(nextCard++);
		
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
		
	}
	
	public void add(Card card) {
		deck.add(card);
	}
	//length of deck
	public int getSize() {
		return deck.size();
	}
	
	public Card get(int i) {
		return deck.get(i);
	}
}