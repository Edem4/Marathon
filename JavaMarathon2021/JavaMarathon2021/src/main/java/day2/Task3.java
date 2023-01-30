package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int a = numbers.nextInt();
        int b = numbers.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            a += 1;
            while (a < b) {
                if (a % 5 == 0) {
                    if (a % 10 != 0) {
                        System.out.print(a + " ");
                    }
                }
                a++;
            }
        }
    }
}
