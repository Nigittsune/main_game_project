package com.project.blackjack;

import java.util.Arrays;

public class BlackJack {

	public static void main(String[] args) {
		
		
		
//		CardDeck cardDeck = new CardDeck();
//		
//		System.out.println(Arrays.toString(cardDeck.shuffledDeck));
//		for (int i = 0; i < cardDeck.shuffledDeck.length + 3; i++) {
//			System.out.println(cardDeck.drawCard());
//		}
//		System.out.println(cardDeck.drawCard());
		
		GameFactory blackJackF = new GameFactory();
		GameBase blackJack = blackJackF.getGame("Black Jack");
	}
}
