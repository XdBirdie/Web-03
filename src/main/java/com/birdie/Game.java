package com.birdie;

public class Game {
    private CardSet black;
    private CardSet white;

    public Game(String black, String white) {
        this.black = new CardSet(black);
        this.white = new CardSet(white);
    }

    public String getResult(){
        return null;
    }
}
