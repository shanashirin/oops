import graphics.*;

public class TestGraphics {
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 5);
        Shape tri = new Triangle(8, 6);
        Shape square = new Square(4);
        Shape circle = new Circle(3.5);

        rect.area();
        tri.area();
        square.area();
        circle.area();
    }
}
