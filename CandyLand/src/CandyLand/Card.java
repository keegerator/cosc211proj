// Samuel Holtzman
// Keegan Dwyer
package CandyLand;

public class Card {
	
	private String type;
	private String color;
	private String numBlock;
	
	
	public Card(String type, String color, String numBlock) {
		this.type = type;
		this.color = color;
		this.numBlock = numBlock;
		
	}
	
	public String toString() {
		return "type: " + type + " color: " + color + " Number of blocks: " + numBlock;
	}

}
