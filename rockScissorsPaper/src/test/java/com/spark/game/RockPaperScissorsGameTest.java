package com.spark.game;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockPaperScissorsGameTest {

	@Test
	public void rockBeatsScissors() {
		RockPaperScissorsGame game = new RockPaperScissorsGame();
		assertEquals("rock", game.whoWins("rock", "scissors"));
	}

}
