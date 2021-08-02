package oop.tasks.collections10;

public class PetRun {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom", "siamese", "cat", "Tomas Jon O'Neil");
        Parrot kesha = new Parrot("Kesha", "budgerigar", "parrot", "Leila Mary Smith");
        Dog spiky = new Dog("Spiky", "bulldog", "dog", "Henry Tomas Jefferson");

        PetMap pets = new PetMap(tom, kesha, spiky);

        System.out.println(pets.printPetsNames());
    }
}
