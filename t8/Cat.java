package oop.tasks.t8;

public class Cat extends Animal{
    public String animalName;
    public String catBreed;

    public Cat(String food, String location, String animalName, String catBreed) {
        super(food, location);
        this.animalName = animalName;
        this.catBreed = catBreed;
    }

    public String getAnimalName() {
        return animalName;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String makeNoise() {
        return getAnimalName() + " meows.";
    }

    public String eat() {
        return getAnimalName() + " loves to hunt rodents";
    }
}
