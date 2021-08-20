package oop.tasks.collections7;

public class WarehouseOfHeavyBoxesListVersionRun {
    public static void main(String[] args) {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox steelBox = new HeavyBox("steel box", 6.1, 5.2, 4.4, 42.3);
        HeavyBox titanBox = new HeavyBox("titan box", 3.1, 6.2, 5.4, 23.3);
        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);
        HeavyBox silverBox = new HeavyBox("silver box", 4.8, 12.2, 11.4, 60.3);
        HeavyBox bronzeBox = new HeavyBox("bronze box", 16.1, 11.2, 24.4, 62.3);
        HeavyBox copperBox = new HeavyBox("copper box", 33.1, 61.2, 15.4, 13.3);

        HeavyBox bigIronBox = new HeavyBox("big iron box", 200.6, 300.5, 260.8, 420.5);
        HeavyBox bigWoodBox = new HeavyBox("big wood box", 300.6, 300.5, 360.8, 320.3);
        HeavyBox bigSteelBox = new HeavyBox("big steel box", 100.6, 200.5, 160.8, 620.4);
        HeavyBox bigTitanBox = new HeavyBox("big titan box", 150.6, 250.5, 260.8, 540.2);

        WarehouseOfBoxesListVersion warehouseOfBoxesNo1 = new WarehouseOfBoxesListVersion(ironBox, woodBox, glassBox, silverBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo2 = new WarehouseOfBoxesListVersion(ironBox, silverBox, steelBox, titanBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo3 = new WarehouseOfBoxesListVersion(bronzeBox, copperBox, woodBox, silverBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo4 = new WarehouseOfBoxesListVersion(ironBox, bigIronBox, bigSteelBox, glassBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo5 = new WarehouseOfBoxesListVersion(bigWoodBox, bigTitanBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo6 = new WarehouseOfBoxesListVersion(ironBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo7 = new WarehouseOfBoxesListVersion();

        System.out.println("No1");
        System.out.println(warehouseOfBoxesNo1);
        System.out.println();

        System.out.println("No2");
        System.out.println(warehouseOfBoxesNo2);
        System.out.println();

        System.out.println("No3");
        System.out.println(warehouseOfBoxesNo3);
        System.out.println();

        System.out.println("No4");
        System.out.println(warehouseOfBoxesNo4);
        System.out.println();

        System.out.println("No5");
        System.out.println(warehouseOfBoxesNo5);
        System.out.println();

        System.out.println("No6");
        System.out.println(warehouseOfBoxesNo6);
        System.out.println();

        System.out.println("No7");
        System.out.println(warehouseOfBoxesNo7);
        System.out.println();

        warehouseOfBoxesNo4.weightSorter(warehouseOfBoxesNo6);

        System.out.println("No4 after weightSorter");
        System.out.println(warehouseOfBoxesNo4);
        System.out.println();

        System.out.println("No6 after weightSorter");
        System.out.println(warehouseOfBoxesNo6);
        System.out.println();

    }
}
