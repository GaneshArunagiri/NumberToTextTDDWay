package com.spark.game;

public enum Choices {

	ROCK, SCISSORS, PAPER;
	static Choices createChoice(String input){
                return Choices.valueOf(input);
    }
}
