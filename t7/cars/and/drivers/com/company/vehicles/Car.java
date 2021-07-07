package oop.tasks.t7.cars.and.drivers.com.company.vehicles;

import oop.tasks.t7.cars.and.drivers.com.company.details.Engine;
import oop.tasks.t7.cars.and.drivers.com.company.professions.Driver;

public class Car {
    private final String markOfAuto;
    private final double weight;
    private final String driverName;
    private final int driverDrivingExperience;
    private final String engineManufacturer;
    private final double enginePower;

    public Car(String markOfAuto, double weight, String driverName, int driverDrivingExperience, String engineManufacturer, double enginePower) {
        this.markOfAuto = markOfAuto;
        this.weight = weight;
        this.driverName = driverName;
        this.driverDrivingExperience = driverDrivingExperience;
        this.engineManufacturer = engineManufacturer;
        this.enginePower = enginePower;
    }

    public Car(String markOfAuto, double weight, Driver driver, Engine engine) {
        this.markOfAuto = markOfAuto;
        this.weight = weight;
        this.driverName = driver.getFullName();
        this.driverDrivingExperience = driver.getDrivingExperience();
        this.engineManufacturer = engine.getManufacturer();
        this.enginePower = engine.getPower();
    }

    public String getMarkOfAuto() {
        return markOfAuto;
    }

    public double getWeight() {
        return weight;
    }

    public String getDriverName() {
        return driverName;
    }



    public int getDriverDrivingExperience() {
        return driverDrivingExperience;
    }

    public String getEngineManufacturer() {
        return engineManufacturer;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public String start() {
        return getMarkOfAuto() + " Поехали";
    }

    public String stop() {
        return getMarkOfAuto() + " Останавливаемся";
    }

    public String turnLeft() {
        return getMarkOfAuto() + " Поворот налево";
    }

    public String turnRight() {
        return getMarkOfAuto() + " Поворот направо";
    }

    public String printInfo() {
        return "Марка автомобиля: " + getMarkOfAuto() + ", вес автомобиля: " + getWeight() + ". "
                + "Имя водителя: " + getDriverName() + ", стаж вождения: " + getDriverDrivingExperience() + ". "
                + "Производитель двигателя: " + getEngineManufacturer() + ", мощность: " + getEnginePower() + ". ";
    }
}
