package com.birdie;

public class Card implements Comparable{
    static public final int D = 1;
    static public final int S = 1;
    static public final int H = 1;
    static public final int C = 1;
    private int color;
    private int point;

    public Card(String pattern){
        char c = pattern.charAt(0);
        if (c >= '2' && c <= '9') point = c - '0';
        else {
            switch (c){
                case 'T': point = 10; break;
                case 'J': point = 11; break;
                case 'Q': point = 12; break;
                case 'K': point = 13; break;
                case 'A': point = 14; break;
            }
        }
        switch (pattern.charAt(1)){
            case 'H': color = H; break;
            case 'S': color = S; break;
            case 'C': color = C; break;
            case 'D': color = D; break;
        }
    }

    @Override
    public int compareTo(Object o) {
        Card card = (Card) o;
        if (this.point == card.point) return 0;
        return (this.point > card.point ? 1 : -1);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
