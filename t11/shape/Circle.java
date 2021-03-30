package oop.tasks.t11.shape;

public class Circle extends Shape {

    private double x;
    private double y;
    private double radius;
    private final double pi = 3.14159;
    String color;

    public Circle(double x, double y, double radius, String color) {
        this.color = color;
        this.setX(x);
        this.setY(y);
        this.setRadius(radius);
    }

    public String getColor() {
        return color;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getPi() {
        return pi;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("This is a circle of radius " + getRadius()
                + ", coordinates of the center of the circle are " + "(" + getX() + ", "
                + getY() + ")" + ", the color of the circle - " + getColor() + ".");
    }
}
