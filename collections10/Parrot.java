package oop.tasks.collections10;

public class Parrot extends Pet {
    private String breed;
    private String kindOfPet;

    public Parrot(String name, String breed, String kindOfPet) {
        super(name);
        this.breed = breed;
        this.kindOfPet = kindOfPet;
    }
}
