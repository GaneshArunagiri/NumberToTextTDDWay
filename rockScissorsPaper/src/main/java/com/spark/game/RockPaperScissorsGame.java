package com.spark.game;

public class RockPaperScissorsGame {

	public String whoWins(String string, String string2) {
		String winner="";
		if(string.equals("rock")) winner="rock";
		else winner="scissors";
		return winner;
	}

}
