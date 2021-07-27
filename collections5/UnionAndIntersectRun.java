package oop.tasks.collections5;

import java.util.Set;

public class UnionAndIntersectRun {
    public static void main(String[] args) {
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

        Set<HeavyBox> unionSetWarehouseOfBoxes = warehouseOfBoxesNo1.union(warehouseOfBoxesNo2.toSet(), warehouseOfBoxesNo3.toSet());

        Set<HeavyBox> intersectSetWarehouseOfBoxesNo1 = warehouseOfBoxesNo1.intersect(warehouseOfBoxesNo2.toSet());
        Set<HeavyBox> intersectSetWarehouseOfBoxesNo2 = warehouseOfBoxesNo1.intersect(warehouseOfBoxesNo2.toSet(), warehouseOfBoxesNo4.toSet());


        System.out.println("warehouseOfBoxesNo1: \n" + warehouseOfBoxesNo1);
        System.out.println();

        System.out.println("warehouseOfBoxesNo2: \n" + warehouseOfBoxesNo2);
        System.out.println();

        System.out.println("warehouseOfBoxesNo3: \n" + warehouseOfBoxesNo3);
        System.out.println();

        System.out.println(unionSetWarehouseOfBoxes);
        System.out.println(intersectSetWarehouseOfBoxesNo1);
        System.out.println(intersectSetWarehouseOfBoxesNo2);
    }
}
