package oop.tasks.t12.product;

public class ProductTests {
    public static void main(String[] args) {
        testNumberOfItems();
        testPurchaseAmount();
    }

    static void testNumberOfItems() {
        Product phone = new Product("phone", 250, 4.8);
        Product notebook = new Product("notebook", 0.3, 4.9);
        Product laptop = new Product("laptop", 300, 4.9);
        Basket basket1 = new Basket(phone, notebook, laptop);
        int number = basket1.numberOfItems();
        assert number == 3;
    }

    static void testPurchaseAmount() {
        Product phone = new Product("phone", 250, 4.8);
        Product notebook = new Product("notebook", 0.3, 4.9);
        Product laptop = new Product("laptop", 300, 4.9);
        Basket basket1 = new Basket(phone, notebook, laptop);
        double number = basket1.purchaseAmount();
        assert number == 550.3;
    }
}
