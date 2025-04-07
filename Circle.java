package graphics;

public class Circle implements Shape {
    double radius;

    public Circle(double r) {
        this.radius = r;
    }

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

