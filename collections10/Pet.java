package oop.tasks.collections10;

public class Pet {
    private String name;
    private String breed;
    private String kindOfPet;
    private String petOwnersFullName;

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
}
