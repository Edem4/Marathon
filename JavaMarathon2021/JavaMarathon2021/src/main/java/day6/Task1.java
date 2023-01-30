package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike moto = new Motorbike("suzuki","black",2022);
        car.setModel("m5");
        car.setYear(2022);
        car.setColor("black");

        car.info();
        System.out.println(car.yearDifference(2023));

        moto.info();
        System.out.println(moto.yearDifference(2015));
    }
}
