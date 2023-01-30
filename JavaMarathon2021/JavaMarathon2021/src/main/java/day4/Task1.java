package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArr = scanner.nextInt();

        int[] arr = new int[sizeArr];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        int x = 0;

        for (int i : arr) {
            x += i;
            if (i % 2 != 0) {
                d++;
            }
            if (i <= 8) {
                if (i == 1) {
                    b++;
                } else if (i % 2 == 0) {
                    c++;
                }
            } else {
                a++;
                d++;
            }

        }
        System.out.println("Длинна массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + a);
        System.out.println("Количество числе равных 1: " + b);
        System.out.println("Количество четных чисел: " + c);
        System.out.println("Количество нечетных чисел: " + d);
        System.out.println("Сумма всех элементов массива: " + x);


    }
}
