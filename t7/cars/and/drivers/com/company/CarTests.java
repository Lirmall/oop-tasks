package oop.tasks.t7.cars.and.drivers.com.company;

import oop.tasks.t7.cars.and.drivers.com.company.details.Engine;
import oop.tasks.t7.cars.and.drivers.com.company.details.IncorrectEnginePowerException;
import oop.tasks.t7.cars.and.drivers.com.company.professions.Driver;
import oop.tasks.t7.cars.and.drivers.com.company.vehicles.Car;
import oop.tasks.t7.cars.and.drivers.com.company.vehicles.Lorry;
import oop.tasks.t7.cars.and.drivers.com.company.vehicles.SportCar;

public class CarTests {
    public static void main(String[] args) throws IncorrectEnginePowerException {
        testEnginePower();
        testDriverAge();
        testDriverDrivingExperiences();
        carTest1();
        carTest2();
        lorryTest();
        sportCarTest();
    }

    public static void testEnginePower() throws IncorrectEnginePowerException {
        Engine engine1 = new Engine("Volkswagen", 120);

        assert engine1.getPower() == 120;
    }

    public static void testDriverAge() {
        Driver driver1 = new Driver("Li Ming", 40, 20);

        int age = driver1.getAge();
        assert driver1.getAge() == 40;
        int drivingExperience = driver1.getDrivingExperience();
        assert drivingExperience > 0;
        assert drivingExperience < age;
    }

    public static void testDriverDrivingExperiences() {
        Driver driver1 = new Driver("Li Ming", 40, 20);

        assert driver1.getDrivingExperience() == 20;
    }

    public static void carTest1() {
        Car car1 = new Car("Ford", 800, "John Will", 15, "Ford", 45);

        assert car1.getWeight() == 800;
        assert car1.getDriverDrivingExperience() == 15;
        assert car1.getEnginePower() == 45;
    }

    public static void carTest2() throws IncorrectEnginePowerException {
        Engine engine1 = new Engine("Volkswagen", 120);
        Driver driver1 = new Driver("Li Ming", 40, 20);
        Car car2 = new Car("Toyota", 650, driver1, engine1);

        assert car2.getWeight() == 650;
        assert car2.getEnginePower() == 120;
        assert driver1.getDrivingExperience() == 20;
    }

    public static void lorryTest() throws IncorrectEnginePowerException {
        Engine engine1 = new Engine("Volkswagen", 120);
        Driver driver1 = new Driver("Li Ming", 40, 20);
        Lorry lorry1 = new Lorry("Man", 2500, driver1, engine1, 20000);

        assert lorry1.getWeight() == 2500;
        assert lorry1.getEnginePower() == 120;
        assert driver1.getDrivingExperience() == 20;
        assert lorry1.getBodyLiftingCapacity() == 20000;
    }

    public static void sportCarTest() throws IncorrectEnginePowerException {
        Engine engine1 = new Engine("Volkswagen", 120);
        Driver driver1 = new Driver("Li Ming", 40, 20);
        SportCar sportCar1 = new SportCar("BMW", 700, driver1, engine1, 240);

        assert sportCar1.getWeight() == 700;
        assert sportCar1.getEnginePower() == 120;
        assert driver1.getDrivingExperience() == 20;
        assert sportCar1.getMaxSpeed() == 240;
    }
}
