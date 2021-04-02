package oop.tasks.t12.product;

public class Category {
    private String name;

    public Category(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void categoryAndProducts(Product... products) {
        System.out.print("The category " + this.getName() + " contains the following products: " + "\n");
        for (Product p : products) {
            System.out.print(p.getName() + ",");
        }
        System.out.println();
    }
}
