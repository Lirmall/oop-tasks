package oop.tasks.collections7;

public class WeightSorterOfHeavyBoxesListVersionTests {
    public static void main(String[] args) {
        testEmptyFirstWarehouse();
        testEmptyDestinationWarehouse();
        testFirstWarehouseHasNoBigHeavyBoxes();

    }

    public static void testEmptyFirstWarehouse () {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);

        HeavyBox bigIronBox = new HeavyBox("big iron box", 200.6, 300.5, 260.8, 420.5);
        HeavyBox bigSteelBox = new HeavyBox("big steel box", 100.6, 200.5, 160.8, 620.4);

        WarehouseOfBoxesListVersion warehouseOfBoxesNo1 = new WarehouseOfBoxesListVersion();
        WarehouseOfBoxesListVersion warehouseOfBoxesNo2 = new WarehouseOfBoxesListVersion(ironBox, bigIronBox, bigSteelBox, glassBox);

        WarehouseOfBoxesListVersion warehouseOfBoxesNo3 = new WarehouseOfBoxesListVersion();
        WarehouseOfBoxesListVersion warehouseOfBoxesNo4 = new WarehouseOfBoxesListVersion(ironBox, bigIronBox, bigSteelBox, glassBox);

        warehouseOfBoxesNo1.weightSorter(warehouseOfBoxesNo2);

        assert warehouseOfBoxesNo1.getHeavyBoxList().equals(warehouseOfBoxesNo3.getHeavyBoxList());
        assert warehouseOfBoxesNo2.getHeavyBoxList().equals(warehouseOfBoxesNo4.getHeavyBoxList());

    }

    public static void testEmptyDestinationWarehouse () {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);

        HeavyBox bigIronBox = new HeavyBox("big iron box", 200.6, 300.5, 260.8, 420.5);
        HeavyBox bigSteelBox = new HeavyBox("big steel box", 100.6, 200.5, 160.8, 620.4);

        WarehouseOfBoxesListVersion warehouseOfBoxesNo1 = new WarehouseOfBoxesListVersion(ironBox, bigIronBox, bigSteelBox, glassBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo2 = new WarehouseOfBoxesListVersion();
        WarehouseOfBoxesListVersion warehouseOfBoxesNo3 = new WarehouseOfBoxesListVersion(bigIronBox, bigSteelBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo4 = new WarehouseOfBoxesListVersion(ironBox, glassBox);

        warehouseOfBoxesNo1.weightSorter(warehouseOfBoxesNo2);

        assert warehouseOfBoxesNo1.getHeavyBoxList().equals(warehouseOfBoxesNo4.getHeavyBoxList());
        assert warehouseOfBoxesNo2.getHeavyBoxList().equals(warehouseOfBoxesNo3.getHeavyBoxList());

    }

    public static void testFirstWarehouseHasNoBigHeavyBoxes () {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);
        HeavyBox silverBox = new HeavyBox("silver box", 4.8, 12.2, 11.4, 60.3);

        WarehouseOfBoxesListVersion warehouseOfBoxesNo1 = new WarehouseOfBoxesListVersion(ironBox, woodBox, glassBox, silverBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo2 = new WarehouseOfBoxesListVersion(ironBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo3 = new WarehouseOfBoxesListVersion(ironBox, woodBox, glassBox, silverBox);
        WarehouseOfBoxesListVersion warehouseOfBoxesNo4 = new WarehouseOfBoxesListVersion(ironBox);

        warehouseOfBoxesNo1.weightSorter(warehouseOfBoxesNo2);

        assert warehouseOfBoxesNo1.getHeavyBoxList().equals(warehouseOfBoxesNo3.getHeavyBoxList());
        assert warehouseOfBoxesNo2.getHeavyBoxList().equals(warehouseOfBoxesNo4.getHeavyBoxList());

    }
}
