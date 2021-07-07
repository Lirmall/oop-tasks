package oop.tasks.t8;

public class Horse extends Animal{
    public String horseName;
    public String horseBreed;

    public Horse(String food, String location, String animalName, String catBreed) {
        super(food, location);
        this.horseName = animalName;
        this.horseBreed = catBreed;
    }

    public String getHorseName() {
        return horseName;
    }

    public String getHorseBreed() {
        return horseBreed;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public void setHorseBreed(String horseBreed) {
        this.horseBreed = horseBreed;
    }

    public String makeNoise() {
        return getHorseName() + " whinnies.";
    }

    public String eat() {
        return getHorseName() + " loves hay.";
    }
}
