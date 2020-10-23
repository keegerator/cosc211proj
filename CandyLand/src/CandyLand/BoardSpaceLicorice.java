// Samuel Holtzman
// Keegan Dwyer
package CandyLand;
import CandyLand.Card;
import CandyLand.Board;

public class BoardSpaceLicorice extends BoardSpace {
	private char type;
	private char color;
	
	public BoardSpaceLicorice(char type, char color) {
		super(type, color);
		this.type = type;																			
		this.color = color;		
		
	}
	 
	public String toString() {
		return "" + type + color;
		}

	public int onLanding(Card card, Board board, Player player) {
		//overload for player landing on licorice space
		
		
		
		return 1;
	}
	
}