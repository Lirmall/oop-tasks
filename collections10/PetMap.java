package oop.tasks.collections10;

import java.util.*;

public class PetMap {
    private Map<Integer, Pet> petMap = new HashMap<>();

    public PetMap(Pet... pets) {
        for (Pet p : pets) {
            this.petMap.put(p.hashCode(), p);
        }
    }

    public Map<Integer, Pet> getPetMap() {
        return petMap;
    }

    public String printPetsKeySet() {
        String result = "";
        Iterator<Integer> itr = this.petMap.keySet().iterator();
        while (itr.hasNext()) {
            Integer name = itr.next();
            result = result.concat(name + "\n");
        }

        return result;
    }

    public String printPetNames() {
        String result = "";
        for (Pet pet : this.petMap.values()) {
            result = result.concat(pet.getName() + "\n");
        }
        return result;
    }

}
