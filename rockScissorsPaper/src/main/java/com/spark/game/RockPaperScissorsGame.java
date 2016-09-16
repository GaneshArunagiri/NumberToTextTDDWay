package com.spark.game;

public class RockPaperScissorsGame {

	public String whoWins(String gestureOfPlayerOne, String gestureOfPlayerTwo) {
		Choices playerOneChoice = Choices.createChoice(gestureOfPlayerOne);
		Choices playerTwoChoice = Choices.createChoice(gestureOfPlayerTwo);
		Choices winner;

		if (playerOneChoice.equals(Choices.ROCK))
			winner = (playerTwoChoice==Choices.SCISSORS?Choices.ROCK:Choices.PAPER);
		else if (playerOneChoice.equals(Choices.SCISSORS))
			winner = (playerTwoChoice==Choices.PAPER?Choices.SCISSORS:Choices.ROCK);
		else
			winner = Choices.PAPER;

		return winner.toString();
	}

}
