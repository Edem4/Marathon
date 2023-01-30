package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String srcInt = "D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\file1.txt\\";
        try {
            String srcDoubel = "D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\file2.txt\\";
            PrintWriter file1 = new PrintWriter(srcInt, StandardCharsets.UTF_8);
            File numFileInt = new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\file1.txt\\");

            for (int i = 0; i < 1000; i++) {
                file1.print(Math.round(Math.random() * 100) + " ");
            }
            file1.close();

            int e = 0;
            double sum = 0;
            PrintWriter file2 = new PrintWriter(srcDoubel, StandardCharsets.UTF_8);
            Scanner scan = new Scanner(numFileInt);
                String[] strNum = scan.nextLine().split(" ");
                for(int i = 0; i < strNum.length; i++) {
                    sum += Integer.parseInt(strNum[i]);
                    e++;
                    if (e == 20) {
                        file2.println(sum/e);
                        sum = 0;
                        e = 0;
                    }
                }

            file2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File fileDoubel = new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\file2.txt\\");
        printResult(fileDoubel);
    }

    public static void printResult(File file){
        double sum = 0;
        try {
            Scanner scnaFile = new Scanner(file);
            String[] str = scnaFile.nextLine().split(" ");
            for(String s: str){
                sum += Double.parseDouble(s);
            }
            scnaFile.close();
            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

