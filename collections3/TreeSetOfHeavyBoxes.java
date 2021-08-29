package oop.tasks.collections3;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetOfHeavyBoxes {
    public static void main(String[] args) {

        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox steelBox = new HeavyBox("steel box", 6.1, 5.2, 4.4, 42.3);
        HeavyBox titanBox = new HeavyBox("titan box", 3.1, 6.2, 5.4, 23.3);

        Set<HeavyBox> heavyBoxWarehouse = new TreeSet<>();

        heavyBoxWarehouse.add(ironBox);
        heavyBoxWarehouse.add(woodBox);
        heavyBoxWarehouse.add(steelBox);
        heavyBoxWarehouse.add(titanBox);

        for (HeavyBox hb : heavyBoxWarehouse) {
            System.out.println(hb);
        }
    }
}
