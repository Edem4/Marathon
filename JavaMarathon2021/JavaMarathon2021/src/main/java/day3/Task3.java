package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        for(int i = 0; i < 5;i++) {
            double a = num.nextDouble();
            double b = num.nextDouble();
            if(b <= 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a/b);
        }
    }
}
