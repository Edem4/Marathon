package day19;

import java.io.*;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new  File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\dushi.txt");
        try {
            Scanner scanText = new Scanner(file);
            scanText.useDelimiter("[.,:;()?!\"\\s-]+");
            Map<String,Integer> word = new HashMap<>();
            int i = 1;
            while (scanText.hasNext()){
                String s = scanText.next();
                if(word.containsKey(s)){
                    word.put(s,word.get(s)+1);
                }else {
                    word.put(s, i);
                }
            }

            System.out.println(word.get("обходительное"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
