package oop.tasks.collections10;

public class Dog extends Pet {
    private String breed;
    private String kindOfPet;

    public Dog(String name, String breed, String kindOfPet) {
        super(name);
        this.breed = breed;
        this.kindOfPet = kindOfPet;
    }
}
