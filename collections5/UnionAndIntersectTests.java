package oop.tasks.collections5;

import java.util.HashSet;

public class UnionAndIntersectTests {
    public static void main(String[] args) {
        testUnionTwoSets();
        testUnionThreeSets();
        testUnionWithEmptySet();

        testIntersectTwoSets();
        testUnionThreeSets();
        testIntersectWithEmptySet();
    }

    public static void testUnionTwoSets () {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox steelBox = new HeavyBox("steel box", 6.1, 5.2, 4.4, 42.3);
        HeavyBox titanBox = new HeavyBox("titan box", 3.1, 6.2, 5.4, 23.3);
        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);
        HeavyBox silverBox = new HeavyBox("silver box", 4.8, 12.2, 11.4, 60.3);

        WarehouseOfBoxes warehouseOfBoxesNo1 = new WarehouseOfBoxes(ironBox, woodBox, glassBox, silverBox);
        WarehouseOfBoxes warehouseOfBoxesNo2 = new WarehouseOfBoxes(ironBox, silverBox, steelBox, titanBox);
        WarehouseOfBoxes warehouseOfBoxesNo3 = new WarehouseOfBoxes(ironBox, woodBox, steelBox, titanBox, glassBox, silverBox);
        HashSet<HeavyBox> result = warehouseOfBoxesNo3.toSet();

        assert warehouseOfBoxesNo1.union(warehouseOfBoxesNo2.toSet()).equals(result);
    }

    public static void testUnionThreeSets () {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox steelBox = new HeavyBox("steel box", 6.1, 5.2, 4.4, 42.3);
        HeavyBox titanBox = new HeavyBox("titan box", 3.1, 6.2, 5.4, 23.3);
        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);
        HeavyBox silverBox = new HeavyBox("silver box", 4.8, 12.2, 11.4, 60.3);
        HeavyBox bronzeBox = new HeavyBox("bronze box", 16.1, 11.2, 24.4, 62.3);
        HeavyBox copperBox = new HeavyBox("copper box", 33.1, 61.2, 15.4, 13.3);

        WarehouseOfBoxes warehouseOfBoxesNo1 = new WarehouseOfBoxes(ironBox, woodBox, glassBox, silverBox);
        WarehouseOfBoxes warehouseOfBoxesNo2 = new WarehouseOfBoxes(ironBox, silverBox, steelBox, titanBox);
        WarehouseOfBoxes warehouseOfBoxesNo3 = new WarehouseOfBoxes(bronzeBox, copperBox, woodBox, silverBox);
        WarehouseOfBoxes warehouseOfBoxesNo4 = new WarehouseOfBoxes(ironBox, woodBox, steelBox, titanBox, glassBox,
                silverBox, bronzeBox, copperBox);
        HashSet<HeavyBox> result = warehouseOfBoxesNo4.toSet();

        assert  warehouseOfBoxesNo1.union(warehouseOfBoxesNo2.toSet(), warehouseOfBoxesNo3.toSet()).equals(result);
    }

    public static void testUnionWithEmptySet () {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);
        HeavyBox silverBox = new HeavyBox("silver box", 4.8, 12.2, 11.4, 60.3);

        WarehouseOfBoxes warehouseOfBoxesNo1 = new WarehouseOfBoxes(ironBox, woodBox, glassBox, silverBox);
        HashSet<HeavyBox> emptyWarehouseOfBoxes = new HashSet<>();
        HashSet<HeavyBox> result = warehouseOfBoxesNo1.toSet();

        assert warehouseOfBoxesNo1.union(emptyWarehouseOfBoxes).equals(result);
    }

    public static void testIntersectTwoSets () {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox steelBox = new HeavyBox("steel box", 6.1, 5.2, 4.4, 42.3);
        HeavyBox titanBox = new HeavyBox("titan box", 3.1, 6.2, 5.4, 23.3);
        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);
        HeavyBox silverBox = new HeavyBox("silver box", 4.8, 12.2, 11.4, 60.3);


        WarehouseOfBoxes warehouseOfBoxesNo1 = new WarehouseOfBoxes(ironBox, woodBox, glassBox, silverBox);
        WarehouseOfBoxes warehouseOfBoxesNo2 = new WarehouseOfBoxes(ironBox, silverBox, steelBox, titanBox);
        WarehouseOfBoxes warehouseOfBoxesNo3 = new WarehouseOfBoxes(ironBox, silverBox);
        HashSet<HeavyBox> result = warehouseOfBoxesNo3.toSet();

        assert warehouseOfBoxesNo1.intersect(warehouseOfBoxesNo2.toSet()).equals(result);

    }

    public static void testIntersectThreeSets () {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox steelBox = new HeavyBox("steel box", 6.1, 5.2, 4.4, 42.3);
        HeavyBox titanBox = new HeavyBox("titan box", 3.1, 6.2, 5.4, 23.3);

        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);
        HeavyBox silverBox = new HeavyBox("silver box", 4.8, 12.2, 11.4, 60.3);
        HeavyBox bronzeBox = new HeavyBox("bronze box", 16.1, 11.2, 24.4, 62.3);
        HeavyBox copperBox = new HeavyBox("copper box", 33.1, 61.2, 15.4, 13.3);

        WarehouseOfBoxes warehouseOfBoxesNo1 = new WarehouseOfBoxes(ironBox, woodBox, glassBox, silverBox);
        WarehouseOfBoxes warehouseOfBoxesNo2 = new WarehouseOfBoxes(ironBox, silverBox, steelBox, titanBox);
        WarehouseOfBoxes warehouseOfBoxesNo3 = new WarehouseOfBoxes(bronzeBox, copperBox, woodBox, silverBox);
        WarehouseOfBoxes warehouseOfBoxesNo4 = new WarehouseOfBoxes(ironBox);

        HashSet<HeavyBox> result = warehouseOfBoxesNo4.toSet();

        assert warehouseOfBoxesNo1.intersect(warehouseOfBoxesNo2.toSet(), warehouseOfBoxesNo3.toSet()).equals(result);
    }

    public static void testIntersectWithEmptySet () {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);
        HeavyBox silverBox = new HeavyBox("silver box", 4.8, 12.2, 11.4, 60.3);

        WarehouseOfBoxes warehouseOfBoxesNo1 = new WarehouseOfBoxes(ironBox, woodBox, glassBox, silverBox);
        HashSet<HeavyBox> emptyWarehouseOfBoxes = new HashSet<>();
        HashSet<HeavyBox> result = new HashSet<>();

        assert warehouseOfBoxesNo1.intersect(emptyWarehouseOfBoxes).equals(result);
    }
}
