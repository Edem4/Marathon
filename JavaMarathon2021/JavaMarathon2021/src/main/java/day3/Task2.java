package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        while (true) {
            double a = num.nextDouble();
            double b = num.nextDouble();
            if(b <= 0) break;
            System.out.println(a/b);
        }
    }
}
