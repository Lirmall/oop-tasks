package oop.tasks.t8;

public class Horse extends Animal{
    public String animalName;
    public String catBreed;

    public Horse(String food, String location, String animalName, String catBreed) {
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
        return getAnimalName() + " whinnies.";
    }

    public String eat() {
        return getAnimalName() + " loves hay.";
    }
}
