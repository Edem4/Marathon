package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("s7",1997,200,2300);
        Airplane air2 = new Airplane("Aeroflot",2000,201,2000);

        Airplane.compareAirplanes(air2,air1);

    }
}