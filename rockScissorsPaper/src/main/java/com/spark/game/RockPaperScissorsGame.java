package com.spark.game;

public class RockPaperScissorsGame {

	public String whoWins(String gestureOfPlayerOne, String gestureOfPlayerTwo) {
		String winner="";
		if(gestureOfPlayerOne.equals("rock")) winner="rock";
		else winner="scissors";
		return winner;
	}

}
