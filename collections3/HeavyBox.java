package oop.tasks.collections3;

public class HeavyBox implements Comparable<HeavyBox> {
    private String name;
    private double length;
    private double width;
    private double height;
    private double weight;

    public HeavyBox(String name, double length, double width, double height, double weight) {
        this.name = name;
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Box length must be greater than zero");
        }

        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Box width must be greater than zero");
        }

        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Box height must be greater than zero");
        }

        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public HeavyBox weightChange(double d) {
        return new HeavyBox(this.getName(), this.getLength(), this.getWidth(), this.getHeight(), this.getWeight() + d);
    }

    @Override
    public String toString() {
        return name +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight;
    }

    @Override
    public int compareTo(HeavyBox heavyBox) {
        int result = 0;
        if (this.getWeight() > heavyBox.getWeight()) {
            result = 1;
        } else {
            if (this.getWeight() < heavyBox.getWeight()) {
                result = -1;
            }
        }
        return result;
    }
}
