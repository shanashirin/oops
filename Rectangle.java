package graphics;

public class Rectangle implements Shape {
    double length, breadth;

    public Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }

    public void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}
