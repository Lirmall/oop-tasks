package oop.tasks.collections11;

import java.util.*;

public class ProductsList {
    private List<Product> productList = new ArrayList<>();

    public ProductsList(Product... products) {
        Collections.addAll(this.productList, products);
    }

    public List<Product> getProductList() {
        return this.productList;
    }

    public String printSortedByName() {
        String result = "";
        ArrayList<Product> products = new ArrayList<>(this.getProductList());
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        products.sort(productComparator);
        result = result.concat(products.toString());
        return result;
    }

    public String printSortedByPrice() {
        String result = "";
        ArrayList<Product> products = new ArrayList<>(this.getProductList());
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (10*(o1.getPrice() - o2.getPrice()));
            }
        };
        products.sort(productComparator);
        result = result.concat(products.toString());
        return result;
    }

    public String printSortedByRating() {
        String result = "";
        ArrayList<Product> products = new ArrayList<>(this.getProductList());
        Comparator<Product> productComparator = (o1, o2) -> (int) (10*(o1.getRating() - o2.getRating()));
        products.sort(productComparator);
        result = result.concat(products.toString());
        return result;
    }

    public String reversePrintSortedByName() {
        String result = "";
        ArrayList<Product> products = new ArrayList<>(this.getProductList());
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        products.sort(productComparator.reversed());

        result = result.concat(products.toString());
        return result;
    }

    public String reversePrintSortedByPrice() {
        String result = "";
        ArrayList<Product> products = new ArrayList<>(this.getProductList());
        Comparator<Product> productComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (10*(o1.getPrice() - o2.getPrice()));
            }
        };
        products.sort(productComparator.reversed());
        result = result.concat(products.toString());
        return result;
    }

    public String reversePrintSortedByRating() {
        String result = "";
        ArrayList<Product> products = new ArrayList<>(this.getProductList());
        Comparator<Product> productComparator = (o1, o2) -> (int) (10*(o1.getRating() - o2.getRating()));
        products.sort(productComparator.reversed());
        result = result.concat(products.toString());
        return result;
    }


    @Override
    public String toString() {
        Iterator<Product> productIterator = this.productList.iterator();
        String result = "";
        while (productIterator.hasNext()) {
            result = result.concat(productIterator.next().toString());
        }
        return result;
    }
}
