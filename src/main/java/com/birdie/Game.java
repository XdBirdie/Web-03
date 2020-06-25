package com.birdie;

public class Game {
    private CardSet black;
    private CardSet white;

    public Game(String black, String white) {
        this.black = new CardSet(black);
        this.white = new CardSet(white);
    }

    private int getRank(CardSet cards){
        int t;
        if ((t = cards.isShunkoAndSameFlower()) != 0) return 13 * 6 + t;
        if ((t = cards.isSameFlower()) != 0) return 13 * 5 + t;
        if ((t = cards.isShunko()) != 0) return 13 * 4 + t;
        if ((t = cards.isThree()) != 0) return 13 * 3 + t;
        if ((t = cards.isTwoTwo()) != 0) return 13 * 2 + t;
        if ((t = cards.isTwo()) != 0) return 13 + t;
        if ((t = cards.isBreak()) != 0) return t;
        // 永远不会取到
        return 0;
    }

    public String getResult(){
        int rankB, rankW;
        rankB = getRank(black);
        rankW = getRank(white);
        System.out.println("Black" +rankB);
        System.out.println("White" +rankW);
        if (rankB == rankW) return "Tie";
        return (rankB > rankW ? "Black wins" : "White wins");
    }
}
