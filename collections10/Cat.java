package oop.tasks.collections10;

public class Cat extends Pet {
    private String breed;
    private String kindOfPet;

    public Cat(String name, String breed, String kindOfPet) {
        super(name);
        this.breed = breed;
        this.kindOfPet = kindOfPet;
    }
}
