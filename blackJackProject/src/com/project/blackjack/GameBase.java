package com.project.blackjack;

import java.util.HashMap;

public abstract class GameBase implements Gameable{
	
	HashMap<Player, PlayerHand> players;
	
	public abstract void joinTable();
}
