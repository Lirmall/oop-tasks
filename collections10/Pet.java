package oop.tasks.collections10;

import java.util.Objects;

public class Pet {
    private final String name;
    private final String breed;
    private final String kindOfPet;
    private final String petOwnersFullName;

    public Pet(String name, String breed, String kindOfPet, String petOwnersFullName) {
        this.name = name;
        this.breed = breed;
        this.kindOfPet = kindOfPet;
        this.petOwnersFullName = petOwnersFullName;
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public String getKindOfPet() {
        return this.kindOfPet;
    }

    public String getPetOwnersFullName() {
        return this.petOwnersFullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return getName().equals(pet.getName()) && getBreed().equals(pet.getBreed()) && getKindOfPet().equals(pet.getKindOfPet()) && getPetOwnersFullName().equals(pet.getPetOwnersFullName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBreed(), getKindOfPet(), getPetOwnersFullName());
    }
}
