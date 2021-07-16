package oop.tasks.collections6;

import java.util.ArrayDeque;

public class ArrayDequeOfHeavyBoxesRun {
    public static void main(String[] args) {
        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox steelBox = new HeavyBox("steel box", 6.1, 5.2, 4.4, 42.3);
        HeavyBox titanBox = new HeavyBox("titan box", 3.1, 6.2, 5.4, 23.3);

        HeavyBox glassBox = new HeavyBox("glass box", 5.6, 4.2, 12.4, 112.3);
        HeavyBox silverBox = new HeavyBox("silver box", 4.8, 12.2, 11.4, 60.3);
        HeavyBox bronzeBox = new HeavyBox("bronze box", 16.1, 11.2, 24.4, 62.3);
        HeavyBox copperBox = new HeavyBox("copper box", 33.1, 61.2, 15.4, 13.3);

        ArrayDeque<HeavyBox> warehouseOfHeavyBoxesNo1 = new ArrayDeque<>();

        warehouseOfHeavyBoxesNo1.offer(ironBox);
        warehouseOfHeavyBoxesNo1.offer(woodBox);
        warehouseOfHeavyBoxesNo1.offer(steelBox);
        warehouseOfHeavyBoxesNo1.offer(titanBox);
        warehouseOfHeavyBoxesNo1.offer(glassBox);
        warehouseOfHeavyBoxesNo1.offer(silverBox);
        warehouseOfHeavyBoxesNo1.offer(bronzeBox);
        warehouseOfHeavyBoxesNo1.offer(copperBox);

        System.out.println(warehouseOfHeavyBoxesNo1);
        System.out.println();

        warehouseOfHeavyBoxesNo1.poll();
        warehouseOfHeavyBoxesNo1.poll();
        warehouseOfHeavyBoxesNo1.poll();
        warehouseOfHeavyBoxesNo1.poll();

        System.out.println(warehouseOfHeavyBoxesNo1);
    }
}
