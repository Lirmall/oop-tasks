package oop.tasks.collections7;

import java.util.*;

public class WarehouseOfBoxesListVersion {
    private List<HeavyBox> heavyBoxList = new ArrayList<>();

    public List<HeavyBox> getHeavyBoxList() {
        return this.heavyBoxList;
    }

    public WarehouseOfBoxesListVersion() {

    }

    public WarehouseOfBoxesListVersion(HeavyBox... hb) {
        Collections.addAll(this.heavyBoxList, hb);
    }


    public String toString() {
        String result = "";

        if (!this.getHeavyBoxList().listIterator().hasNext()) {
            result = "This warehouse is empty";
        }

        if (this.getHeavyBoxList().iterator().hasNext()) {
            for (HeavyBox heavyBox : this.getHeavyBoxList()) {
                result = result.concat(heavyBox.toString() + "\n");
            }
        }
        return result;
    }

    public void weightSorter(WarehouseOfBoxesListVersion warehouse) {
        ListIterator<HeavyBox> heavyBoxIterator = this.getHeavyBoxList().listIterator();
        ListIterator<HeavyBox> warehouseIterator = warehouse.getHeavyBoxList().listIterator();

        if (!heavyBoxIterator.hasNext()) {
            System.out.println("This warehouse is empty. You cannot pick up something from an empty warehouse ");
        }

        while (heavyBoxIterator.hasNext()) {
            HeavyBox heavyBox = heavyBoxIterator.next();
            if (heavyBox.getWeight() > 300) {
                warehouseIterator.add(heavyBox);
                heavyBoxIterator.remove();
            }
        }
    }
}
