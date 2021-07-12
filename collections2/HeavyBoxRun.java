package oop.tasks.collections2;

import java.util.ArrayList;
import java.util.List;

public class HeavyBoxRun {
    public static void main(String[] args) {

        HeavyBox ironBox = new HeavyBox("iron box", 5.1, 6.2, 7.4, 12.3);
        HeavyBox woodBox = new HeavyBox("wood box", 4.1, 4.2, 1.4, 8.3);
        HeavyBox steelBox = new HeavyBox("steel box", 6.1, 5.2, 4.4, 42.3);
        HeavyBox titanBox = new HeavyBox("titan box", 3.1, 6.2, 5.4, 23.3);

        List<HeavyBox> arrayListOfHeavyBoxes = new ArrayList<>();

        arrayListOfHeavyBoxes.add(ironBox);
        arrayListOfHeavyBoxes.add(woodBox);
        arrayListOfHeavyBoxes.add(steelBox);
        arrayListOfHeavyBoxes.add(titanBox);

        for (Object hb : arrayListOfHeavyBoxes) {
            System.out.println(hb);
        }
        System.out.println();

        titanBox = titanBox.weightChange(1.0);
        arrayListOfHeavyBoxes.set(arrayListOfHeavyBoxes.size() - 1, titanBox);

        for (Object hb : arrayListOfHeavyBoxes) {
            System.out.println(hb);
        }
        System.out.println();

        arrayListOfHeavyBoxes.remove(arrayListOfHeavyBoxes.remove(arrayListOfHeavyBoxes.size() - 1));

        for (Object hb : arrayListOfHeavyBoxes) {
            System.out.println(hb);
        }
        System.out.println();

        HeavyBox[] arrayOfBoxesNo1 = new HeavyBox[arrayListOfHeavyBoxes.size()];


        arrayListOfHeavyBoxes.toArray(arrayOfBoxesNo1);
        for (HeavyBox hb : arrayOfBoxesNo1) {
            System.out.println(hb);
        }
        System.out.println();

        HeavyBox[] arrayOfBoxesNo2 = arrayListOfHeavyBoxes.toArray(new HeavyBox[0]);

        for (HeavyBox hb : arrayOfBoxesNo2) {
            System.out.println(hb);
        }
        System.out.println();

        HeavyBox[] arrayOfBoxesNo3 = new HeavyBox[arrayListOfHeavyBoxes.size()];
        for (int i = 0; i < arrayListOfHeavyBoxes.size(); i++) {
            arrayOfBoxesNo3[i] = arrayListOfHeavyBoxes.get(i);
        }

        for (HeavyBox hb : arrayOfBoxesNo3) {
            System.out.println(hb);
        }
        System.out.println();

        arrayListOfHeavyBoxes.clear();
        System.out.println(arrayListOfHeavyBoxes);
    }
}
