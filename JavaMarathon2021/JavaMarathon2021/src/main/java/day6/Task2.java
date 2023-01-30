package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air = new Airplane("airobus", 2020, 30, 890);
        air.setLength(32);
        air.setYear(2014);
        air.fillUp(25);
        air.fillUp(26);

        air.info();
    }
}
