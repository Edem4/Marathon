package day9.Task2;

import day9.Task1.Teacher;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")

        };
    }
    public static double calculateRedPerimeter(Figure[] figures){
        double res = 0 ;
        for(Figure obj:figures){
            if(obj.getColor().equals("Red")){
                res += obj.perimeter();
            }
        }
        return res;
    }
    public static double calculateRedArea(Figure[] figures){
        double res = 0;
        for(Figure obj:figures){
            if("Red".equals(obj.getColor())){
                res += obj.area();
            }
        }
        return res;
    }


}
