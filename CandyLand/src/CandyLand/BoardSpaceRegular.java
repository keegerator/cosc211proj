// Samuel Holtzman
// Keegan Dwyer
package CandyLand;
import CandyLand.Card;
import CandyLand.Board;

public class BoardSpaceRegular extends BoardSpace {
	private char type;
	private char color;
	
	public BoardSpaceRegular(char type, char color) {
		super(type, color);
		this.type = type;																			
		this.color = color;		
		
	}
	 
	public String toString() {
		return "" + type + color;
		}

	public int onLanding(Card card, Board board, Player player) {
		//overload, will update location for player landing on a regular space
		
		return 1;
	}
	
}