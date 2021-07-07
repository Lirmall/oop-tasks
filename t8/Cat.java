package oop.tasks.t8;

public class Cat extends Animal{
    public String catName;
    public String catBreed;

    public Cat(String food, String location, String animalName, String catBreed) {
        super(food, location);
        this.catName = animalName;
        this.catBreed = catBreed;
    }

    public String getCatName() {
        return catName;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    public String makeNoise() {
        return getCatName() + " meows.";
    }

    public String eat() {
        return getCatName() + " loves to hunt rodents";
    }
}
