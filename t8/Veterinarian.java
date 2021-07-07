package oop.tasks.t8;

public class Veterinarian {
    private String fullName;

    public Veterinarian(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void treatAnimal(Animal ... animal) {
        for (Animal a: animal)
        System.out.println(a.getFood() + " " + a.getLocation());
    }
}
