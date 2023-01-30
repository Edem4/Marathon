package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
       File file = new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\people.txt\\");
        System.out.println( parseFileToStringList(file));
    }
    public static List<String> parseFileToStringList(File file) {
        List<String> str = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()){
                str.add(scan.nextLine());
            }
            for(String arg: str){
                String[] age = arg.split(" ");
                if(Integer.parseInt(age[1]) < 0){
                    str.clear();
                    throw new IllegalArgumentException();
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e){
            System.out.println("Некорректный входной файл");
        }
        return str;
    }
}
