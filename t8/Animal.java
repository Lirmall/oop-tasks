package oop.tasks.t8;

public class Animal {
    private final String food;
    private final String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }



    public String makeNoise(){
        return "Animal makes noise";
    }

    public String eat() {
        return "Animal eating";
    }

    public String sleep() {
        return "Animal is sleeping";
    }
}
