package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\people.txt\\");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<String> str = new ArrayList<>();
        List<Person> obj = new ArrayList<>();
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                str.add(scan.nextLine());
            }
            for (String s : str) {
                String[] arg = s.split(" ");
                if (Integer.parseInt(arg[1]) < 0) {
                    obj.clear();
                    throw new IllegalArgumentException();
                } else {
                    obj.add(new Person(arg[0], Integer.parseInt(arg[1])));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return obj;
    }
}
