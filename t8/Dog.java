package oop.tasks.t8;

public class Dog extends Animal {
    private String animalName;
    private String dogBreed;

    public Dog(String food, String location, String animalName, String dogBreed) {
        super(food, location);
        this.animalName = animalName;
        this.dogBreed = dogBreed;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String makeNoise() {
        return getAnimalName() + " barks.";
    }

    public String eat() {
        return getAnimalName() + " loves to gnaw bones";
    }
}
