package oop.tasks.t11.shape;

public class Rectangle extends Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;
    private String color;

    public Rectangle(double x1, double y1,
                     double x2, double y2,
                     double x3, double y3,
                     double x4, double y4,
                     String color) {
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
        this.setX3(x3);
        this.setY3(y3);
        this.setX4(x4);
        this.setY4(y4);
        this.setColor(color);
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getY4() {
        return y4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void draw() {
        System.out.println(
                "This is a rectangle, the coordinates of the vertices are "
                        + "(" + getX1() + ";" + getY1() + ")" + ", "
                        + "(" + getX2() + ";" + getY2() + ")" + ", "
                        + "(" + getX3() + ";" + getY3() + ")" + ", "
                        + "(" + getX4() + ";" + getY4() + ")" + ", "
                        + "the color of the rectangle - " + getColor() + "."
        );
    }
}
