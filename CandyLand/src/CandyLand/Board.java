// Samuel Holtzman
// Keegan Dwyer
package CandyLand;		

import CandyLand.BoardSpace;

public class Board {
	private static int width;
	private static int length;
	private static int p1Pos = 0;
	private static int p2Pos = 0;
	private static int p3Pos = 0;
	private static int p4Pos = 0;

	public static BoardSpace[] board;
	
	//static array which creates a string object representing type and color of all 134 spaces 
	//first letter corresponds to type: R = regular, S = special for shortcut, L = licorice, and the second char represents the color of the space
	String[] spaceData = new String[] {
	 "SR", "RB", "RG", "RY", "RO", "LP", "RR", "RB", "RG", "RY",
	 "RO", "RR", "RG", "RY", "RB", "RO", "RP", "RR", "RG", "RY",
	 "RB", "RG", "RO", "RY", "RG", "RB", "RR", "RY", "RP", "RB",
	 "RP", "RR", "RG", "SB", "RO", "RY", "RG", "RR", "RY", "RG",
	 "RP", "RO", "RY", "RR", "RG", "RR", "RP", "RB", "RG", "RY",
	 "RP", "RR", "RO", "RG", "RR", "RY", "RG", "RB", "RY", "RR",
	 "RG", "RY", "RO", "RP", "RG", "RB", "RR", "RO", "RG", "RP",
	 "RY", "RR", "RG", "RO", "RP", "LR", "RB", "RO", "RR", "RY",
	 "RO", "RP", "RG", "RY", "RR", "RO", "RB", "RY", "RR", "RG",
	 "RR", "RO", "RG", "RY", "RB", "RO", "RP", "RG", "RR", "RO",
	 "RB", "RO", "RY", "RR", "RP", "RB", "RP", "RR", "RO", "RY",
	 "RG", "LG", "RR", "RP", "RY", "RR", "RG", "RB", "RP", "RY",
	 "RR", "RB", "RG", "RO", "RY", "RP", "RR", "RB", "RG", "RY",
	 "RO", "RY", "RR", "RB", "RP"
			};
	
	public Board() {
		board = new BoardSpace[134]; 
		 for (int i = 0; i <= 133; i++){
			 String s = spaceData[i];
			 char bs_type = s.charAt(0); //		here we pull the first and second char of the string from above, then use it to create a boardspace 
			 char bs_color = s.charAt(1);
			 
			 BoardSpace bb = null;		
		
			switch (bs_type) {
		 		case 'S': 			
					bb = new BoardSpaceSpecial(bs_type, bs_color);
				break;
		 		case 'R':
		 			bb = new BoardSpaceRegular(bs_type, bs_color);
		 			break;
		 		case 'L': 
		 			bb = new BoardSpaceLicorice(bs_type, bs_color);
		 			break;
			}
			
			board[i] = bb;
		 
		 } //closes for loop, and creates the board
	}
		
	//this method prints the board, and then the player's location
	 public void print() {
	 for (int i=0; i <= 133; i++){
		System.out.print(i+ ":" +board[i] + " ");
		if (p1Pos == i) {
			System.out.print("P1 ");
		}
		if (p2Pos == i) {
			System.out.print("P2 ");
		}
		if (p3Pos == i) {
			System.out.print("P3 ");
		}
		if (p4Pos == i) {
			System.out.print("P4 ");
		}
			
	 	}
	 }

		
	}
