package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner  numbers = new Scanner(System.in);
        int a = numbers.nextInt();
        int b = numbers.nextInt();

        if(a >= b){
            System.out.println("Некорректный ввод");
        }else {
            for(int i = a+1; i<b; i++ ){
                if(i % 5 == 0){
                    if(i % 10 != 0){
                        System.out.print(i+" ");
                    }else continue;
                }
            }
        }
    }
}
