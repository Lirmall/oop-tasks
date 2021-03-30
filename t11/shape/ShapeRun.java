package oop.tasks.t11.shape;

public class ShapeRun {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2, 3, 5, "green");
        Rectangle rectangle1 = new Rectangle(1, 7, 1, -1, 6, -1, 6, 7, "red");

        Shape[] shapes = new Shape[2];
        shapes[0] = circle1;
        shapes[1] = rectangle1;

        for (Shape i : shapes) {
            i.draw();
        }
    }
}
