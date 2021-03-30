package oop.tasks.t11.shape;

public class ShapeTests {
    public static void main(String[] args) {
        testCircle();
        testRectangle();
    }
    static void testCircle() {
        Circle circle1 = new Circle(2, 3, 5, "green");
        double r = circle1.getRadius();
        assert r > 0;
    }
    static void testRectangle() {
        Rectangle rectangle1 = new Rectangle(1, 7, 1, -1, 6, -1, 6, 7, "red");
        double x1 = rectangle1.getX1(), y1 = rectangle1.getY1();
        double x2 = rectangle1.getX2(), y2 = rectangle1.getY2();
        double x3 = rectangle1.getX3(), y3 = rectangle1.getY3();
        double x4 = rectangle1.getX4(), y4 = rectangle1.getY4();

        if (x1 == x2) {
            assert y2 == y3;
            assert y4 == y1;
        }

        if (y1 == y2) {
            assert x2 == x3;
            assert x4 == x1;
        }
    }
}
