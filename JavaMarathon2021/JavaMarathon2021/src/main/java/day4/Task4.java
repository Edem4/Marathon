package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }

        System.out.println(Arrays.toString(arr));

        int sumThreeElement = 0;
        int maxSumThreeElement = 0;
        int indexFirstElement = 0;

        for (int i = 0; i < (arr.length - 2); i++) {
            sumThreeElement = arr[i] + arr[i + 1] + arr[i + 2];
            if (sumThreeElement > maxSumThreeElement) {
                maxSumThreeElement = sumThreeElement;
                indexFirstElement = i;
            }
            sumThreeElement = 0;
        }

        System.out.println(maxSumThreeElement);
        System.out.println(indexFirstElement);
    }
}
