package oop.tasks.t7.cars.and.drivers.com.company.vehicles;

import oop.tasks.t7.cars.and.drivers.com.company.details.Engine;
import oop.tasks.t7.cars.and.drivers.com.company.professions.Driver;

public class SportCar extends Car{
    private double maxSpeed;

    public SportCar(String markOfAuto, double weight, Driver driver, Engine engine, double maxSpeed) {
        super(markOfAuto, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
