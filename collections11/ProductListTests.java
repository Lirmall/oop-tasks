package oop.tasks.collections11;

public class ProductListTests {
    public static void main(String[] args) {
        testPrintNormalSort();
        testPrintSortedByName();
        testPrintSortedByPrice();
        testPrintSortedByRating();
        testReversePrintSortedByName();
        testReversePrintSortedByPrice();
        testReversePrintSortedByRating();

    }

    public static void testPrintNormalSort() {
        Product soap = new Product("Soap", 15, 4.0);
        Product spanner = new Product("Spanner", 80, 4.5);
        Product fork = new Product("Fork", 20, 4.0);
        Product phone = new Product("Phone", 250, 4.8);
        Product notebook = new Product("Notebook", 0.3, 4.9);
        Product pliers = new Product("Pliers", 20, 3);
        Product laptop = new Product("Laptop", 300, 4.9);

        ProductsList productsList = new ProductsList(soap, spanner, fork, phone, notebook, pliers, laptop);

        assert productsList.toString().equals("Name: Soap, price: 15.0, rating: 4.0\n" +
                "Name: Spanner, price: 80.0, rating: 4.5\n" +
                "Name: Fork, price: 20.0, rating: 4.0\n" +
                "Name: Phone, price: 250.0, rating: 4.8\n" +
                "Name: Notebook, price: 0.3, rating: 4.9\n" +
                "Name: Pliers, price: 20.0, rating: 3.0\n" +
                "Name: Laptop, price: 300.0, rating: 4.9\n");
    }

    public static void testPrintSortedByName() {
        Product soap = new Product("Soap", 15, 4.0);
        Product spanner = new Product("Spanner", 80, 4.5);
        Product fork = new Product("Fork", 20, 4.0);
        Product phone = new Product("Phone", 250, 4.8);
        Product notebook = new Product("Notebook", 0.3, 4.9);
        Product pliers = new Product("Pliers", 20, 3);
        Product laptop = new Product("Laptop", 300, 4.9);

        ProductsList productsList = new ProductsList(soap, spanner, fork, phone, notebook, pliers, laptop);

        assert productsList.printSortedByName().equals("Name: Fork, price: 20.0, rating: 4.0\n" +
                "Name: Laptop, price: 300.0, rating: 4.9\n" +
                "Name: Notebook, price: 0.3, rating: 4.9\n" +
                "Name: Phone, price: 250.0, rating: 4.8\n" +
                "Name: Pliers, price: 20.0, rating: 3.0\n" +
                "Name: Soap, price: 15.0, rating: 4.0\n" +
                "Name: Spanner, price: 80.0, rating: 4.5\n");
    }

    public static void testPrintSortedByPrice() {
        Product soap = new Product("Soap", 15, 4.0);
        Product spanner = new Product("Spanner", 80, 4.5);
        Product fork = new Product("Fork", 20, 4.0);
        Product phone = new Product("Phone", 250, 4.8);
        Product notebook = new Product("Notebook", 0.3, 4.9);
        Product pliers = new Product("Pliers", 20, 3);
        Product laptop = new Product("Laptop", 300, 4.9);

        ProductsList productsList = new ProductsList(soap, spanner, fork, phone, notebook, pliers, laptop);

        assert productsList.printSortedByPrice().equals("Name: Notebook, price: 0.3, rating: 4.9\n" +
                "Name: Soap, price: 15.0, rating: 4.0\n" +
                "Name: Fork, price: 20.0, rating: 4.0\n" +
                "Name: Pliers, price: 20.0, rating: 3.0\n" +
                "Name: Spanner, price: 80.0, rating: 4.5\n" +
                "Name: Phone, price: 250.0, rating: 4.8\n" +
                "Name: Laptop, price: 300.0, rating: 4.9\n");
    }

    public static void testPrintSortedByRating() {
        Product soap = new Product("Soap", 15, 4.0);
        Product spanner = new Product("Spanner", 80, 4.5);
        Product fork = new Product("Fork", 20, 4.0);
        Product phone = new Product("Phone", 250, 4.8);
        Product notebook = new Product("Notebook", 0.3, 4.9);
        Product pliers = new Product("Pliers", 20, 3);
        Product laptop = new Product("Laptop", 300, 4.9);

        ProductsList productsList = new ProductsList(soap, spanner, fork, phone, notebook, pliers, laptop);

        assert productsList.printSortedByRating().equals("Name: Pliers, price: 20.0, rating: 3.0\n" +
                "Name: Soap, price: 15.0, rating: 4.0\n" +
                "Name: Fork, price: 20.0, rating: 4.0\n" +
                "Name: Spanner, price: 80.0, rating: 4.5\n" +
                "Name: Phone, price: 250.0, rating: 4.8\n" +
                "Name: Notebook, price: 0.3, rating: 4.9\n" +
                "Name: Laptop, price: 300.0, rating: 4.9\n");
    }

    public static void testReversePrintSortedByName() {
        Product soap = new Product("Soap", 15, 4.0);
        Product spanner = new Product("Spanner", 80, 4.5);
        Product fork = new Product("Fork", 20, 4.0);
        Product phone = new Product("Phone", 250, 4.8);
        Product notebook = new Product("Notebook", 0.3, 4.9);
        Product pliers = new Product("Pliers", 20, 3);
        Product laptop = new Product("Laptop", 300, 4.9);

        ProductsList productsList = new ProductsList(soap, spanner, fork, phone, notebook, pliers, laptop);

        assert productsList.reversePrintSortedByName().equals("Name: Spanner, price: 80.0, rating: 4.5\n" +
                "Name: Soap, price: 15.0, rating: 4.0\n" +
                "Name: Pliers, price: 20.0, rating: 3.0\n" +
                "Name: Phone, price: 250.0, rating: 4.8\n" +
                "Name: Notebook, price: 0.3, rating: 4.9\n" +
                "Name: Laptop, price: 300.0, rating: 4.9\n" +
                "Name: Fork, price: 20.0, rating: 4.0\n");
    }

    public static void testReversePrintSortedByPrice() {
        Product soap = new Product("Soap", 15, 4.0);
        Product spanner = new Product("Spanner", 80, 4.5);
        Product fork = new Product("Fork", 20, 4.0);
        Product phone = new Product("Phone", 250, 4.8);
        Product notebook = new Product("Notebook", 0.3, 4.9);
        Product pliers = new Product("Pliers", 20, 3);
        Product laptop = new Product("Laptop", 300, 4.9);

        ProductsList productsList = new ProductsList(soap, spanner, fork, phone, notebook, pliers, laptop);

        assert productsList.reversePrintSortedByPrice().equals("Name: Laptop, price: 300.0, rating: 4.9\n" +
                "Name: Phone, price: 250.0, rating: 4.8\n" +
                "Name: Spanner, price: 80.0, rating: 4.5\n" +
                "Name: Fork, price: 20.0, rating: 4.0\n" +
                "Name: Pliers, price: 20.0, rating: 3.0\n" +
                "Name: Soap, price: 15.0, rating: 4.0\n" +
                "Name: Notebook, price: 0.3, rating: 4.9\n");
    }

    public static void testReversePrintSortedByRating() {
        Product soap = new Product("Soap", 15, 4.0);
        Product spanner = new Product("Spanner", 80, 4.5);
        Product fork = new Product("Fork", 20, 4.0);
        Product phone = new Product("Phone", 250, 4.8);
        Product notebook = new Product("Notebook", 0.3, 4.9);
        Product pliers = new Product("Pliers", 20, 3);
        Product laptop = new Product("Laptop", 300, 4.9);

        ProductsList productsList = new ProductsList(soap, spanner, fork, phone, notebook, pliers, laptop);

        assert productsList.reversePrintSortedByRating().equals("Name: Notebook, price: 0.3, rating: 4.9\n" +
                "Name: Laptop, price: 300.0, rating: 4.9\n" +
                "Name: Phone, price: 250.0, rating: 4.8\n" +
                "Name: Spanner, price: 80.0, rating: 4.5\n" +
                "Name: Soap, price: 15.0, rating: 4.0\n" +
                "Name: Fork, price: 20.0, rating: 4.0\n" +
                "Name: Pliers, price: 20.0, rating: 3.0\n");
    }
}
