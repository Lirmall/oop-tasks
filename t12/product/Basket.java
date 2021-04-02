package oop.tasks.t12.product;

public class Basket {
    private Product[] items;

    public Basket() {
    }

    public Basket(Product... products) {
        items = new Product[products.length];
        if (products.length - 1 >= 0) System.arraycopy(products, 0, items, 0, products.length);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Product p : items) {
            result.append(p.getName()).append("\t");
        }
        return result.toString();
    }

    public int numberOfItems() {
        int number;
        number = items.length;
        return number;
    }

    public double purchaseAmount() {
        double sum = 0;
        for (Product p : items) {
            sum += p.getPrice();
        }
        return sum;
    }

}
