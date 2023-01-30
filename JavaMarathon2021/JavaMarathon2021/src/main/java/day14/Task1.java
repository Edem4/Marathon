 package day14;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SimpleTimeZone;


 public class Task1 {
    public static void main(String[] args){
        File file = new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\text1\\");

        printSumDigits(file);
    }
     public static void printSumDigits(File file){
         try {
             Scanner scan = new Scanner( file);
             String line = scan.nextLine();
             String[] num = line.split(" ");
             if(num.length !=10){
                 throw new IllegalArgumentException();
             }
             int sum = 0;
             for(String str: num){
                 sum += Integer.parseInt(str);
             }
             System.out.println(sum);

         } catch (FileNotFoundException e) {
             System.out.println("Файл не найден");
         } catch (IllegalArgumentException e){
             System.out.println("Некорректный выходной файл");
         }
    }
}
