package com.project.blackjack;

import java.util.Arrays;
import java.util.Collections;

public class CardDeck {

	private String[] orderedDeck;
	public String[] shuffledDeck;
	public int currentCardIndex = 1;
	public String currentCard;
	
	public CardDeck(){
		Cards cards = new Cards();
		this.orderedDeck = cards.orderedDeck;
		this.shuffleDeck(orderedDeck);
	}
	
	/**
     * Shuffle any size {@code deck}.
     * 
     * @param  deck
     *         The initial deck. It can be ordered or shuffled.
     *         Need to be 1D String array.
     */
	public String[] shuffleDeck(String[] deck){
		
//		temporary array to hold the parameter
		String[] shuffled = deck;
//		shuffling the temporary array		
		Collections.shuffle(Arrays.asList(shuffled));
//		return a shuffled array		
		shuffledDeck = shuffled;
		return shuffledDeck;
	}
	
	/**
     * Draw next available (which haven't been drawn yet) {@code card} from the deck.
     * If this was the last card from the deck, the deck is getting again and shuffling.
     * After that the drawing of cards continues from the first one from the shuffled deck.
     */
	public String drawCard(){
		if(currentCardIndex > shuffledDeck.length){
			currentCardIndex = 1;
			shuffleDeck(shuffledDeck);
		}
		
		for (int i = 0; i < currentCardIndex; i++) {
			currentCard = shuffledDeck[i];
		}
		currentCardIndex += 1;
		return currentCard;
	}
}
