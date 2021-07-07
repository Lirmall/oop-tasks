package oop.tasks.t8;

public class VeterinarianRun {
    public static void main(String[] args) {

        Dog dog1 = new Dog("bones", "backyard", "Sparky", "pooch");
        Cat cat1 = new Cat("mouse", "house", "Sammy", "yard cat");
        Horse horse1 = new Horse("hay", "stable", "Winny", "pony");
        Veterinarian veterinarian1 = new Veterinarian("Ellie Smith");

        Animal[] animals = new Animal[3];
        animals[0] = dog1;
        animals[1] = cat1;
        animals[2] = horse1;

        veterinarian1.treatAnimal(animals);
    }
}
