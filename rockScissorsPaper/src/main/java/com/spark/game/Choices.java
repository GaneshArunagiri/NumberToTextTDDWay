package com.spark.game;

public enum Choices {

	ROCK, SCISSORS, PAPER,DRAW;
	
	private Choices beat;

    public Choices getBeats(){
        return beat;
    }

    public void setBeats(Choices opt){
    	beat = opt;
    }

    public static void init(){
        Choices.ROCK.setBeats(Choices.SCISSORS);
        Choices.PAPER.setBeats(Choices.ROCK);
        Choices.SCISSORS.setBeats(Choices.PAPER);
    }
	static Choices createChoice(String input){
                return Choices.valueOf(input);
    }
}
