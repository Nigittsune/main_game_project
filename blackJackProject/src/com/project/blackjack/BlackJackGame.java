package com.project.blackjack;

import java.util.ArrayList;

public class BlackJackGame extends GameBase{
	
	CardDeck cardDeck = new CardDeck();
	BlackJackLogic logic = new BlackJackLogic();
	
	private static BlackJackGame bj_instance = new BlackJackGame();

	private  BlackJackGame() {
		startRound();
	}
	
	public static GameBase getInstance(){
		return bj_instance;
	}
	
	public void startRound(){
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
