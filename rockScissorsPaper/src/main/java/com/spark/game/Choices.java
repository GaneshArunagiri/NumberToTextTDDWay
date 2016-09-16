package com.spark.game;

public enum Choices {

	ROCK, SCISSORS, PAPER,DRAW;
	static Choices createChoice(String input){
                return Choices.valueOf(input);
    }
}
