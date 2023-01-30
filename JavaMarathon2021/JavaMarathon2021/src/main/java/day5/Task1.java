package day5;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setModel("m5");
        bmw.setColor("black");
        bmw.setYear(2018);
        System.out.println(bmw.getModel());
        System.out.println(bmw.getColor());
        System.out.println(bmw.getYear());

    }
}


