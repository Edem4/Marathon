package day9.Task2;

public class Circle extends Figure {
    int radius;

    public Circle( int radius,String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
