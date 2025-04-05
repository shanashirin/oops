import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    public void perimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle: " + perimeter);
    }
}

class Rectangle implements Shape {
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        double area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }

    public void perimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}

public class ShapeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter radius of the circle: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(radius);
                circle.area();
                circle.perimeter();
            } else if (choice == 2) {
                System.out.print("Enter length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                Rectangle rect = new Rectangle(length, breadth);
                rect.area();
                rect.perimeter();
            } else if (choice == 3) {
                System.out.println("Exiting program");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
        
        sc.close();
    }
}


