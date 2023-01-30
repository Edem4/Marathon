package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner storey = new Scanner(System.in);
        int numStorey = storey.nextInt();
        if (numStorey <= 4 && numStorey > 0) {
            System.out.println("Малоэтажный дом");
        } else if (numStorey <= 8 && numStorey >= 5) {
            System.out.println("Среднеэтажный дом");
        } else if (numStorey >= 9 && numStorey > 0) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
