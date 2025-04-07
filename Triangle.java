package graphics;

public class Triangle implements Shape {
    double base, height;

    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}


