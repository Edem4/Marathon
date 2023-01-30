package day7.day8;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel = 0;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель: " + this.manufacturer +
                ", год выпуска: " + this.year +
                ", длина: " + this.length +
                ", вес: " + this.weight +
                ", количество топлива в баке: " + this.getFuel());
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + this.manufacturer +
                ", год выпуска: " + this.year +
                ", длина: " + this.length +
                ", вес: " + this.weight +
                ", количество топлива в баке: " + this.getFuel();
    }
}
