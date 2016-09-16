package com.spark.game;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RockPaperScissorsGameTest {

	private RockPaperScissorsGame game;

	@Before
	public void setup() {
		game = new RockPaperScissorsGame();
	}

	@Test
	public void rockBeatsScissors() {
		assertEquals("ROCK", game.whoWins("ROCK", "SCISSORS"));
	}

	@Test
	public void scissorsBeatsPaper() {
		assertEquals("SCISSORS", game.whoWins("SCISSORS", "PAPER"));
	}

	@Test
	public void paperBeatsRock() {
		assertEquals("PAPER", game.whoWins("PAPER", "ROCK"));
	}
	@Test
	public void rockLostWithPaper() {
		RockPaperScissorsGame game=new RockPaperScissorsGame();
		assertEquals("PAPER",game.whoWins("ROCK","PAPER"));
	}
	@After
	public void cleanup() {
		game = null;
	}
}
