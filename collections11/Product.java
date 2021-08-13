package oop.tasks.collections11;

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

    @Override
    public String toString() {
        return "Name: " + name +
                ", price: " + price +
                ", rating: " + rating + "\n";
    }
}
