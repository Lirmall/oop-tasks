package oop.tasks.collections8;

public class ProductRun {
    public static void main(String[] args) {
        Product teddyBear = new Product("Teddy",
                "plush",
                "soft toy",
                30.2,
                20.7,
                45.6,
                0.950,
                3.2,
                150.10);

        Product constructionKit = new Product("Build your city!",
                "plastic",
                "constructor kit",
                50.2,
                50.7,
                35.6,
                1.250,
                4.3,
                180.50);

        Product toyCar = new Product("Kirby",
                "plastic",
                "car",
                10.2,
                10.7,
                25.6,
                0.250,
                3.8,
                50.30);

        Product toyCubes = new Product("Collect the words",
                "wood",
                "educational toys",
                50.2,
                50.7,
                25.6,
                1.950,
                4.2,
                110.75);

        Product doll = new Product("Minny",
                "plastic",
                "doll",
                20.2,
                10.7,
                15.6,
                0.150,
                4.2,
                80.70);

        WarehouseOfProducts warehouseOfProductsNo1 = new WarehouseOfProducts(teddyBear, constructionKit, toyCar,toyCubes, doll);

        System.out.println(warehouseOfProductsNo1.printFullList());
        System.out.println();

        System.out.println(warehouseOfProductsNo1.printNamesList());
        System.out.println();

        System.out.println(warehouseOfProductsNo1.printProductsList());
        System.out.println();

    }
}
