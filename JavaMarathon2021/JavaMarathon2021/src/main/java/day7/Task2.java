package day7;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int min = 90;
        int max = 100;
        int diff = max - min;
        Random random = new Random();


        Player player1 = new Player((random.nextInt(diff + 1)) + min);
        Player player2 = new Player((random.nextInt(diff + 1)) + min);
        Player player3 = new Player((random.nextInt(diff + 1)) + min);
        Player player4 = new Player((random.nextInt(diff + 1)) + min);
        Player player5 = new Player((random.nextInt(diff + 1)) + min);
        Player player6 = new Player((random.nextInt(diff + 1)) + min);
        Player player7 = new Player((random.nextInt(diff + 1)) + min);
        Player player8 = new Player((random.nextInt(diff + 1)) + min);

        System.out.println(player1.getStamina());
        System.out.println(player2.getStamina());
        System.out.println(player3.getStamina());
        System.out.println(player4.getStamina());
        System.out.println(player5.getStamina());

        System.out.println(Player.getCountPlayers());

    }
}
