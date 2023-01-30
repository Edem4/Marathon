package day0;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        PlayField player1 = new PlayField();
        PlayField player2  =new PlayField();
        player1.placementShip();
        player2.placementShip();

        PlayField.play(player1,player2);


    }
}