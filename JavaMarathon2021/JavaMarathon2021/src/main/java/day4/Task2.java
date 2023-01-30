package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int zeroNum = 0;
        int calcZeroNum = 0;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length;i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        int max = arr[0];
        int min = arr[0];
        System.out.println(Arrays.toString(arr));
        for(int i:arr){
            if(min > i) min = i;
            if(max < i) max = i;
            if(i % 10 == 0) {
                zeroNum++;
                calcZeroNum += i;
            }
        }
        System.out.println("Наибольшее число в массиве: " + max);
        System.out.println("Наименьшее число в массиве: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + zeroNum);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + calcZeroNum);
    }

}
