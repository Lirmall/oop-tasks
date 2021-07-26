package oop.tasks.collections10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PetMap {
    private Map<String, Pet> petMap = new HashMap<>();

    public PetMap(Pet... pets) {
        for (Pet p : pets) {
            this.petMap.put(p.getName(), p);
        }
    }

    public Map<String, Pet> getPetMap() {
        return petMap;
    }

    public String printPetsNames () {
        String result = "";
        Iterator<String> itr = this.petMap.keySet().iterator();
        while (itr.hasNext()) {
            String name = itr.next();
            result = result.concat(name + "\n");
        }

        return result;
    }

}
