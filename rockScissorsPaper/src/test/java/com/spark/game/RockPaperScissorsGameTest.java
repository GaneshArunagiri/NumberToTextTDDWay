package com.spark.game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorsGameTest {

	private RockPaperScissorsGame game;

	@After
	public void setup() {
		game = new RockPaperScissorsGame();
	}

	@Test
	public void rockBeatsScissors() {
		assertEquals("rock", game.whoWins("rock", "scissors"));
	}

	@Test
	public void scissorsBeatsPaper() {
		assertEquals("scissors", game.whoWins("scissors", "paper"));
	}

	@Test
	public void paperBeatsRock() {
		assertEquals("paper", game.whoWins("paper", "rock"));
	}

	@Before
	public void cleanup() {
		game = null;
	}
}
