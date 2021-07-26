package oop.tasks.collections11;

public class ProductRun {
    public static void main(String[] args) {

        Product soap = new Product("Soap", 15, 4.0);
        Product spanner = new Product("Spanner", 80, 4.5);
        Product fork = new Product("Fork", 20, 4.0);
        Product phone = new Product("Phone", 250, 4.8);
        Product notebook = new Product("Notebook", 0.3, 4.9);
        Product pliers = new Product("Pliers", 20, 3);
        Product laptop = new Product("Laptop", 300, 4.9);

        ProductsList productsList = new ProductsList(soap, spanner, fork, phone, notebook, pliers, laptop);

        System.out.println("Products list:");
        System.out.println(productsList);

        System.out.println("Products list sorted by name:");
        System.out.println(productsList.printSortedByName());

        System.out.println("Products list sorted by price:");
        System.out.println(productsList.printSortedByPrice());

        System.out.println("Products list sorted by rating:");
        System.out.println(productsList.printSortedByRating());

        System.out.println("Products list reverse sorted by name:");
        System.out.println(productsList.reversePrintSortedByName());

        System.out.println("Products list reverse  sorted by price:");
        System.out.println(productsList.reversePrintSortedByPrice());

        System.out.println("Products list reverse sorted by rating:");
        System.out.println(productsList.reversePrintSortedByRating());

    }
}
