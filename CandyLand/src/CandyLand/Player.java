// Samuel Holtzman
// Keegan Dwyer
package CandyLand;
import CandyLand.Deck;

import java.util.Scanner;

public class Player {
	private String name;
	private int age;
	private int location;
	
	private static int numPlayers;
	private static int p1Age = 0; 
	private static int p2Age = 0; 
	private static int p3Age = 0;
	private static int p4Age = 0;
	private static String firstPlayer;
	private static boolean hasTurn = false;
	
	private static Deck deck = new Deck();
	
	public Player(String name, int age, int location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	public boolean isWinner() {
		return true;
	}
	
	public String displayWinner() {
		return "You win!";
	}
	
	
	public static void determineNumPlayers() {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter number of players (2-4): "); // Welcomes and prompts for numPlayers
		 numPlayers = kb.nextInt();

		
		while (numPlayers > 4 || numPlayers < 2) { // checks for correct range of players, will continue to prompt until
													// a value between 2-4 is given
			System.out.println("Invalid number of players! Try again.");
			System.out.print("Enter number of players (2-4): ");
			numPlayers = kb.nextInt();
		}
		
		for (int p = 1; p <= numPlayers; p++) {
			System.out.print("Enter age of player " + p + ": "); // prompts for age of players based on numPlayers
			if (p == 1)
				p1Age = kb.nextInt();
			if (p == 2)
				p2Age = kb.nextInt();
			if (p == 3)
				p3Age = kb.nextInt();
			if (p == 4)
				p4Age = kb.nextInt();
				}
		} //closes determineNumPlayers();
	
	public static Object firstPlayer() {
		
		if (numPlayers == 2) { 				// determines who goes first for 2 players
			if (p1Age <= p2Age ) { 
				firstPlayer = "Player 1";
				hasTurn = true;
			} else firstPlayer = "Player 2";
				hasTurn = true;
			
			
		} else if (numPlayers == 3) { 			// determines who goes first for 3 players
			if (p1Age <= p2Age && p1Age <= p3Age) {// if two players are of the same age, which ever numeric value player comes first will go first (i.e., if p1 and p2 are 10, p1 will always go first
				firstPlayer = "Player 1";
				hasTurn = true;
			} else if (p2Age <= p1Age && p2Age <= p3Age) {
				firstPlayer = "Player 2";
				hasTurn = true;
			} else firstPlayer = "Player 3";
				hasTurn = true;
			
			
		} else if (numPlayers == 4) {			// determines who goes first for 4 players
			if (p1Age <= p2Age && p1Age <= p3Age && p1Age <= p4Age) {
				firstPlayer = "Player 1"; 
				hasTurn = true;
			} else if (p2Age <= p3Age && p2Age <= p1Age && p2Age <= p4Age) { 
				firstPlayer = "Player 2";
				hasTurn = true;
			} else if (p3Age <= p2Age && p3Age <= p1Age && p3Age <= p4Age) {
				firstPlayer = "Player 3";
				hasTurn = true;
			} else  {
				firstPlayer = "Player 4";
				hasTurn = true;
			}
		}

		System.out.println("The first player will be " + firstPlayer);
		return firstPlayer;
		
	} // closes firstPlayer();
	
	public static void hasTurn() {
		if(hasTurn = true) {
			takeTurn();
		}
	}
	
	
	public static void takeTurn() {
		//draw a card
	//	Deck.draw();
		//player moves to corresponding location
		//card --> back into deck
		//hasTurn = false 
		// next player.hasTurn();
		
		
	}
	
	
	
}