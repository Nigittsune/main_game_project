package com.project.blackjack;

import java.util.HashMap;
import java.util.Scanner;

public class BlackJackGame extends GameBase{
	
	CardDeck cardDeck = new CardDeck();
	BlackJackLogic logic = new BlackJackLogic();
	
	private static BlackJackGame bj_instance;

	private  BlackJackGame() {
		players = new HashMap<Player, PlayerHand>();
		joinTable();
		startGame();
	}
	
	public static GameBase getInstance(){
		if(bj_instance == null) {
			return bj_instance = new BlackJackGame();
		}
		return bj_instance;
	}
	
	@Override
	public void joinTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String playerName = sc.nextLine();
		players.put(new Player(playerName), new PlayerHand());
	}
	
	@Override
	public void startGame(){
		//deal first cards
		logic.playerHand.add(cardDeck.drawCard());
//		System.out.println(logic.playerHand);
//		logic.playerHand.add(cardDeck.drawCard());
		System.out.println(logic.playerHand);
		logic.playerHand.add(cardDeck.drawCard());
		System.out.println(logic.playerHand);
		logic.playerHand.add(cardDeck.drawCard());
		System.out.println(logic.playerHand);
		logic.checkHand(logic.playerHand);
		System.out.println(logic.handValue);
	}
	
	public void calculateWin(){
		//check dealer and players hand values and compare them
		//write game into the DB
	}
	
	public void endRound(){
		//clean all variables and prepare them for new round
	}
}
