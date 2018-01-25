package com.project.blackjack;

import java.util.ArrayList;

public class BlackJackLogic {

	public int cardValue = 0;
	public int handValue = 0;
	int acesInHand = 0;
	public ArrayList<String> playerHand = new ArrayList<String>();
	public ArrayList<String> dealerHand = new ArrayList<String>();
	
	public int playerHandValue = 0;
	public int dealerHandValue = 0;
	
//	CardDeck cardDeck = new CardDeck();

	public void checkHand(ArrayList<String> hand){
		for (String card : hand) {
//			handValue += 
					checkCardValue(card);
		}
		for (int i = 0; i < acesInHand; i++) {
			if(handValue > 21){
				handValue -= 10;
			}
		}
//		return handValue;
	}
	

	public int checkCardValue(String card){
		String cardRank;
		int acesInHand = 0;
		
		cardRank = card.substring(1);
		
		switch (cardRank) {
		case "2": handValue += 2; break;
		case "3": handValue += 3; break;
		case "4": handValue += 4; break;
		case "5": handValue += 5; break;
		case "6": handValue += 6; break;
		case "7": handValue += 7; break;
		case "8": handValue += 8; break;
		case "9": handValue += 9; break;
		case "10": handValue += 10; break;
		case "J": handValue += 10; break;
		case "Q": handValue += 10; break;
		case "K": handValue += 10; break;
		case "A": handValue += 11; 
					this.acesInHand += 1; 
					break;

		default:
			System.out.println("There is no such card rank!!!");
			break;
		}
		
		
//			else{
//				handValue += 11;
//			}
//		}
		
		return handValue;
	}
	
}
