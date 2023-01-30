package day15;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String srcFile = "D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\missing_shoes.txt";
        File shoesFile = new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\shoes.csv");
        List<String> shoesList = new ArrayList<>();

        try {
            PrintWriter missingShoesFile = new PrintWriter(srcFile, StandardCharsets.UTF_8);
            Scanner scanFile = new Scanner(shoesFile);
            while (scanFile.hasNextLine()) {
                shoesList.add(scanFile.nextLine());
            }

            for (String s : shoesList) {
                String[] rem = s.split(";");
                if(rem.length != 3){
                    throw new IllegalArgumentException();
                }
                if (rem[2].equals("0")) {
                    missingShoesFile.println(s);
                }
            }
            missingShoesFile.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException r){
            System.out.println("Некорректный файл");
        }
    }
}

