package graphics;

public class Square implements Shape {
    double side;

    public Square(double s) {
        this.side = s;
    }

    public void area() {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
}
