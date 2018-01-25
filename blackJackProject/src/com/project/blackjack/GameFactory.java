package com.project.blackjack;

public class GameFactory {

	public GameBase getGame(String gameType){
		
		switch (gameType) {
		case "Black Jack":
			return BlackJackGame.getInstance();
		case "Quiz Game":
			return null;
		default:
			return null;
		}
	}
}
