package oop.tasks.collections8;

public class Product {
    private String name;
    private String manufacturedMaterial;
    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;
    private double rating;
    private double price;

    public Product(String name, String manufacturedMaterial, String type, double length, double width, double height, double weight, double rating, double price) {
        this.name = name;
        this.manufacturedMaterial = manufacturedMaterial;
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getManufacturedMaterial() {
        return manufacturedMaterial;
    }

    public String getType() {
        return type;
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

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product name: '" + name + '\'' +
                ", manufacturedMaterial: '" + manufacturedMaterial + '\'' +
                ", type: '" + type + '\'' +
                ", length: " + length +
                ", width: " + width +
                ", height: " + height +
                ", weight: " + weight +
                ", rating: " + rating +
                ", price = " + price + "\n";
    }
}
