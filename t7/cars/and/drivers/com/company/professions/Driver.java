package oop.tasks.t7.cars.and.drivers.com.company.professions;

public class Driver extends Person {
    int drivingExpirience;

    public Driver(String fullName, int age, int drivingExpirience) {
        super(fullName, age);
        this.drivingExpirience = drivingExpirience;

    }
}
