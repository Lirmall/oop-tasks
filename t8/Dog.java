package oop.tasks.t8;

public class Dog extends Animal {
    private String dogName;
    private String dogBreed;

    public Dog(String food, String location, String animalName, String dogBreed) {
        super(food, location);
        this.dogName = animalName;
        this.dogBreed = dogBreed;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String makeNoise() {
        return getDogName() + " barks.";
    }

    public String eat() {
        return getDogName() + " loves to gnaw bones";
    }
}
