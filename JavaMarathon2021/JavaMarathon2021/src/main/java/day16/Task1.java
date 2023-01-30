package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\text1\\");
        printResult(file);
    }
    public static void printResult(File file){
        double sum = 0;
        double result = 0;
        try {
            Scanner scanNumber = new Scanner(file);
            String[] s = scanNumber.nextLine().split(" ");
            for(String num: s){
                sum += Integer.parseInt(num);
            }
            result = sum/s.length;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println(result + " --> " + String.format("%.3f",result));
    }
}

