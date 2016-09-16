package com.spark.game;

public class RockPaperScissorsGame {

	public String whoWins(String gestureOfPlayerOne, String gestureOfPlayerTwo) {
		Choices playerOneChoice = Choices.createChoice(gestureOfPlayerOne);
		Choices playerTwoChoice = Choices.createChoice(gestureOfPlayerTwo);
		Choices winner;

		if (playerOneChoice.equals(Choices.ROCK))
			winner = Choices.ROCK;
		else if (playerOneChoice.equals(Choices.SCISSORS))
			winner = Choices.SCISSORS;
		else
			winner = Choices.PAPER;

		return winner.toString();
	}

}
