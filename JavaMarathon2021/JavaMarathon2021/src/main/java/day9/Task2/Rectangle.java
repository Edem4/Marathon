package day9.Task2;

public class Rectangle extends Figure {
    private double height,weight;

    public Rectangle(double height, double weight, String color) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double area() {
        return height*weight;
    }

    @Override
    public double perimeter() {
        return 2*(height+weight);
    }
}
