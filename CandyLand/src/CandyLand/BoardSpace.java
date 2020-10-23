// Samuel Holtzman
// Keegan Dwyer
package CandyLand;
import CandyLand.Card;
import CandyLand.Board;

public abstract class BoardSpace {
	private char type;
	private char color;
	
	public BoardSpace(char type, char color) {	
				
	}
	 
	public String toString() {
		
		return  "" + type + color;	}

	public int onLanding(Card card, Board board, Player player) {
		
		return 1;
	}
	
}