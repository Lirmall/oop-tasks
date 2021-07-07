package oop.tasks.t12.product;

public class Product {
    private final String name;
    private final double price;
    private final double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public double getRating() {
        return rating;
    }
}
