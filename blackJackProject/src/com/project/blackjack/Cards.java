package com.project.blackjack;

public class Cards {
	
	public Cards() {
		this.orderedDeck = getOrderedDeck();
	}

	public enum Rank{
		DEUSE("2"),
		THREE("3"),
		FOUR("4"),
		FIVE("5"),
		SIX("6"),
		SEVEN("7"),
		EIGHT("8"),
		NINE("9"),
		TEN("10"),
		JACK("J"),
		QUEEN("Q"),
		KING("K"),
		ACE("A");
//		JOKER("Jo");
		
		public String shortRankName;

		private Rank(String shortName) {
			this.shortRankName = shortName;
		}
	}
	
	public enum Suit{
		DIAMONDS("D"),
		HEARTS("H"),
		CLUBS("C"),
		SPADES("S");
		
		public String shortSuitName;

		private Suit(String shortName) {
			this.shortSuitName = shortName;
		}
	}
	
	private String[][] deck = new String[Suit.values().length][Rank.values().length];
	public String[] orderedDeck = new String[DECKLENGHT];
	
	
	

	

	public static final int DECKLENGHT = 52;

	/**
     * Get one dimensional array of ordered deck of 52 cards
     */
	public String[] getOrderedDeck(){
//		fill 2D deck with all 52 cards from Rank and Suit enums
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				deck[s.ordinal()][r.ordinal()] = s.shortSuitName + r.shortRankName;
			}
		}
		
//		get 2D deck and put it into 1D orderedDeck
		int k = 0;
		for (int i = 0; i < deck.length; i++) {
			for (int j = 0; j < deck[i].length; j++) {
				orderedDeck[k++] = deck[i][j];
			}
		}
		return orderedDeck;
		
	}
	
}
