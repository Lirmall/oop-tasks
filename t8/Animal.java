package oop.tasks.t8;

public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
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
