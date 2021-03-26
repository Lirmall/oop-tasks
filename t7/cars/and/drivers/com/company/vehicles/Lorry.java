package oop.tasks.t7.cars.and.drivers.com.company.vehicles;

import oop.tasks.t7.cars.and.drivers.com.company.details.Engine;
import oop.tasks.t7.cars.and.drivers.com.company.professions.Driver;

public class Lorry extends Car {
    private double bodyLiftingCapacity;

    public Lorry(String markOfAuto, double weight, Driver driver, Engine engine, double bodyLiftingCapacity) {
        super(markOfAuto, weight, driver, engine);
        this.bodyLiftingCapacity = bodyLiftingCapacity;
    }

    public double getBodyLiftingCapacity() {
        return bodyLiftingCapacity;
    }
}
