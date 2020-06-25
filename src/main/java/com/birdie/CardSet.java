package com.birdie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardSet {
    private List<Card> cards;

    public CardSet(String str){
        this.cards = new ArrayList<>();
        String[] cards = str.split(" ");
        for (String card : cards) {
            this.cards.add(new Card(card));
        }
        Collections.sort(this.cards);
    }

    public int isShunko(){
        int t = cards.get(0).getPoint() - 1;
        for (Card card : cards) {
            if (card.getPoint() != t + 1)
                return 0;
            ++t;
        }
        return t;
    }

    public int isSameFlower(){
        int t = cards.get(0).getColor();
        for (Card card : cards){
            if (card.getColor() != t)
                return 0;
        }
        return cards.get(cards.size() - 1).getPoint();
    }

    // 四条按照三条计算
    public int isThree(){
        int[] cat = new int[15];
        for (Card card : cards) {
            int i = card.getPoint();
            ++cat[i];
            if (cat[i] == 3) return i;
        }
        return 0;
    }

    public int isTwo(){
        int[] cat = new int[15];
        for (Card card : cards) {
            int i = card.getPoint();
            ++cat[i];
            if (cat[i] == 2) return i;
        }
        return 0;
    }

    public int isTwoTwo(){
        int[] cat = new int[15];
        int[] res = new int[2];
        int cnt = 0;
        for (Card card : cards) {
            int i = card.getPoint();
            ++cat[i];
            if (cat[i] == 2) res[cnt++] = i;
        }
        if (cnt == 2) return res[1];
        return 0;
    }

    public int isBreak(){
        return cards.get(cards.size() - 1).getPoint();
    }

}
