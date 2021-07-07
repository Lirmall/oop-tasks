package oop.tasks.t12.product;

public class ProductRun {
    public static void main(String[] args) {
        User user1 = new User("Jonny", "jonnyspassword", "jonny@email.com");
        User user2 = new User("Emily", "emilyspassword", "emily@email.com");
        User user3 = new User("Peter", "peterspassword", "peter@email.com");

        Product soap = new Product("soap", 15, 4);
        Product spanner = new Product("spanner", 80, 4.5);
        Product fork = new Product("fork", 2, 4);
        Product phone = new Product("phone", 250, 4.8);
        Product notebook = new Product("notebook", 0.3, 4.9);
        Product pliers = new Product("pliers", 20, 3);
        Product laptop = new Product("laptop", 300, 4.9);

        Category household = new Category("household");
        Category workers = new Category("workers");
        Category gadgets = new Category("gadgets");

        Basket basket1 = new Basket(phone, notebook, laptop);
        Basket basket2 = new Basket(spanner, pliers);
        Basket basket3 = new Basket(fork, soap, notebook);

        household.categoryAndProducts(soap, spanner, fork, pliers, notebook);
        workers.categoryAndProducts(spanner, pliers);
        gadgets.categoryAndProducts(phone, laptop);
        System.out.println();

        System.out.println(user1.userInfo() + ". " + user1.itemsInBasket(basket1) + ": " + basket1.toString() + ".");
        System.out.println(user3.userInfo() + ". " + user3.itemsInBasket(basket2) + ": " + basket2.toString() + ".");
        System.out.println(user2.userInfo() + ". " + user2.itemsInBasket(basket3) + ": " + basket3.toString() + ".");
    }
}
