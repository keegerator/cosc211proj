// Samuel Holtzman
// Keegan Dwyer
package CandyLand;

import CandyLand.Deck;
import CandyLand.Card;
import CandyLand.Player;
import CandyLand.Board;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		boolean gameOver = false;
		//boolean hasTurn = false;
		
		Player p1 = new Player(null, 0, 0);
		Player p2 = new Player(null, 0, 0);
		Player p3 = new Player(null, 0, 0);
		Player p4 = new Player(null, 0, 0);

		Board board = new Board();
		board.print();

		System.out.println("\nWelcome to C A N D Y L A N D ");
		Player.determineNumPlayers();
		Player.firstPlayer();
		
		//Card card = new Card();
		
		Deck deck = new Deck();
		//deck.add(card);
		deck.shuffle();
		System.out.println("after shuffling: "); // displays created cards in shuffled order
		for (int i = 0; i < deck.getSize(); i++) {
			System.out.println(deck.get(i));
		}

		
		//While (!gameOver){
		// if (!gameOver)
		//		p1.takeTurn();
		//		board.print();  ----- print board after each turn to show updated location
		// if (!gameOver)
		//		gameOver = p2.takeTurn();
		//		board.print();
		// if (!gameOver && p3 != null)
		// 		gameOver = p3.takeTurn();
		//		board.print();
		// if (!gameOver && p4 != null)
		// 		gameOver = p4.takeTurn();
		//		board.print();
		//} if(p1.winner()
		//	system.out.print("player1 wins");
		// else if (p2.winner())
		// system.out,print p2 wins -->  else if...--> p4
		
		
	}
}