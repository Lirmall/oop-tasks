package oop.tasks.t12.product;

public class BasketTests {
    public static void main(String[] args) {
        testNumberOfItems();
        testPurchaseAmount();
    }

    static void testNumberOfItems() {
        Product phone = new Product("phone", 250, 4.8);
        Product notebook = new Product("notebook", 0.3, 4.9);
        Product laptop = new Product("laptop", 300, 4.9);
        Basket basket1 = new Basket(phone, notebook, laptop);

        assert basket1.numberOfItems() == 3;
    }

    static void testPurchaseAmount() {
        Product phone = new Product("phone", 250, 4.8);
        Product notebook = new Product("notebook", 0.3, 4.9);
        Product laptop = new Product("laptop", 300, 4.9);
        Basket basket1 = new Basket(phone, notebook, laptop);

        assert basket1.purchaseAmount() == 550.3;
    }
}
