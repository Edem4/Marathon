package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[12][8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50);
            }
        }


        int maxSumElement = 0;
        int sumElement = 0;
        int indexMaxRow = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int element : arr[i]) {
                sumElement += element;
            }
            if (sumElement > maxSumElement) {
                maxSumElement = sumElement;
                indexMaxRow = i;
            }
            sumElement = 0;
        }
        Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);
        System.out.println(indexMaxRow);
    }
}
