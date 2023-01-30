package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("D:\\JavaMarathon2021\\JavaMarathon2021\\src\\main\\resources\\taxi_cars.txt");
        try {
            Scanner scanTaxi = new Scanner(file);
            Map<Integer, Point> pointTaxi = new HashMap<>();
            while (scanTaxi.hasNext()) {
                pointTaxi.put(Integer.parseInt(scanTaxi.next()),
                        new Point(Integer.parseInt(scanTaxi.next()), Integer.parseInt(scanTaxi.next())));
            }
            scanTaxi.close();

            Scanner scanIn = new Scanner(System.in);
            Set<Point> box = new HashSet<>();
            int x1 = scanIn.nextInt();
            int x2 = scanIn.nextInt();
            int y1 = scanIn.nextInt();
            int y2 = scanIn.nextInt();
            scanIn.close();

            for (int i = x1+1; i < x2; i++) {
                for (int j = y1+1; j < y2; j++) {
                    box.add(new Point(i, j));
                }
            }
            int countTaxi = 0;
            for(int i = 1;i <= pointTaxi.size(); i++){
                if(box.contains(pointTaxi.get(i))){
                    System.out.print(i + " ");
                    countTaxi++;
                }
            }
            System.out.println("");
            System.out.println("Количество машин : "+countTaxi);
//            S

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new RuntimeException(e);
        }
    }
}

