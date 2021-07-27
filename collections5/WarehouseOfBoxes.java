package oop.tasks.collections5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WarehouseOfBoxes {
    HeavyBox[] heavyBoxes;

    public WarehouseOfBoxes(HeavyBox... hb) {
        this.heavyBoxes = new HeavyBox[hb.length];
        System.arraycopy(hb, 0, this.heavyBoxes, 0, hb.length);
    }

    public HeavyBox[] getHeavyBoxes() {
        return heavyBoxes;
    }

    @Override
    public String toString() {
        String result = "";
        for (HeavyBox heavyBox : this.getHeavyBoxes()) {
            result = result.concat(heavyBox.getName() +
                    ", length=" + heavyBox.getLength() +
                    ", width=" + heavyBox.getWidth() +
                    ", height=" + heavyBox.getHeight() +
                    ", weight=" + heavyBox.getWeight() + "\n");
        }
        return result;
    }

    public HashSet<HeavyBox> toSet() {
        HashSet<HeavyBox> result = new HashSet<>();
        Collections.addAll(result, this.getHeavyBoxes());

        return result;
    }

    public Set<HeavyBox> union(Set<HeavyBox>... sets) {
        Set<HeavyBox> result = this.toSet();
        for (Set<HeavyBox> hb : sets) {
            result.addAll(hb);
        }

        return result;
    }

    public Set<HeavyBox> intersect(Set<HeavyBox>... sets) {
        Set<HeavyBox> result = this.toSet();
        for (Set<HeavyBox> s : sets) {
            result.retainAll(s);
        }

        return result;
    }
}
