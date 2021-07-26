package oop.tasks.collections10;

public class PetRun {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", "siamese", "cat");
        Parrot kesha = new Parrot("Kesha", "budgerigar", "parrot");
        Dog spiky = new Dog("Spiky", "bulldog", "dog");

        PetMap pets = new PetMap(tom, kesha, spiky);

        System.out.println(pets.printPetsNames());
    }
}
