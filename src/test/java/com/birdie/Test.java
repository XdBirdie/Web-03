package com.birdie;

import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void whiteWinsWhenTest1(){
        String res = new Game("2H 3D 5S 9C KD", "2C 3H 4S 8C AH").getResult();
        Assert.assertEquals(res, "White wins");
    }

    @org.junit.Test
    public void whiteWinsWhenTest2(){
        String res = new Game("2H 4S 4C 2D 4H", "2S 8S AS QS 3S").getResult();
        Assert.assertEquals(res, "White wins");
    }

    @org.junit.Test
    public void whiteWinsWhenTest3(){
        String res = new Game("2H 3H 5H 9H KH", "2C 3H 4S 5C 6H").getResult();
        Assert.assertEquals(res, "Black wins");
    }

    @org.junit.Test
    public void whiteWinsWhenTest4(){
        String res = new Game("2H 3D 5S 9C KD", "2D 3H 5C 9S KH").getResult();
        Assert.assertEquals(res, "Tie");
    }
}
