// Samuel Holtzman
// Keegan Dwyer
package CandyLand;
import CandyLand.Card;
import CandyLand.Board;

public class BoardSpaceSpecial extends BoardSpace {
	private char type;
	private char color;
	
	public BoardSpaceSpecial(char type, char color) {
		super(type, color);
		this.type = type;																			
		this.color = color;		
		
	}
	 
	public String toString() {
		return "" + type + color;
	}

	public int onLanding(Card card, Board board) {
		
		return 1;
	}
	
}
	


//draw --> where i will go, Space will have onLanding();