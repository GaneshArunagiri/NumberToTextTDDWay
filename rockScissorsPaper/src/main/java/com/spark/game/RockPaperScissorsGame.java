package com.spark.game;

public class RockPaperScissorsGame {

	public String whoWins(String gestureOfPlayerOne, String gestureOfPlayerTwo) {
		Choices playerOneChoice = Choices.createChoice(gestureOfPlayerOne);
		Choices playerTwoChoice = Choices.createChoice(gestureOfPlayerTwo);
		Choices winner=Choices.DRAW;Choices.init();
				
		if (playerOneChoice.getBeats().equals(playerTwoChoice)) 
			winner=playerOneChoice;		
		else if(playerTwoChoice.getBeats().equals(playerOneChoice))
			winner=playerTwoChoice;
		
		return winner.toString();
	}

}
