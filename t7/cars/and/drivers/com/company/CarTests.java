package oop.tasks.t7.cars.and.drivers.com.company;

import oop.tasks.t7.cars.and.drivers.com.company.details.Engine;
import oop.tasks.t7.cars.and.drivers.com.company.professions.Driver;
import oop.tasks.t7.cars.and.drivers.com.company.vehicles.Car;
import oop.tasks.t7.cars.and.drivers.com.company.vehicles.Lorry;
import oop.tasks.t7.cars.and.drivers.com.company.vehicles.SportCar;

public class CarTests {
    public static void main(String[] args) {
        engineTest();
        driverTest();
        carTest1();
        carTest2();
        lorryTest();
        sportCarTest();
    }

    public static void engineTest() {
        Engine engine1 = new Engine("Volkswagen", 120);

        double power = engine1.getPower();
        assert power > 0;
    }

    public static void driverTest() {
        Driver driver1 = new Driver("Li Ming", 40, 20);

        int age = driver1.getAge();
        assert age > 0;
        int drivingExperience = driver1.getDrivingExperience();
        assert drivingExperience > 0;
        assert drivingExperience < age;
    }

    public static void carTest1() {
        Car car1 = new Car("Ford", 800, "John Will", 15, "Ford", 45);

        double weight = car1.getWeight();
        assert weight > 0;
        int drivingExperience = car1.getDriverDrivingExperience();
        assert drivingExperience > 0;
        double enginePower = car1.getEnginePower();
        assert enginePower > 0;
    }

    public static void carTest2() {
        Engine engine1 = new Engine("Volkswagen", 120);
        Driver driver1 = new Driver("Li Ming", 40, 20);
        Car car2 = new Car("Toyota", 650, driver1, engine1);

        double weight = car2.getWeight();
        assert weight > 0;
        double power = car2.getEnginePower();
        assert power > 0;
        int drivingExperience = driver1.getDrivingExperience();
        assert drivingExperience > 0;
    }

    public static void lorryTest() {
        Engine engine1 = new Engine("Volkswagen", 120);
        Driver driver1 = new Driver("Li Ming", 40, 20);
        Lorry lorry1 = new Lorry("Man", 2500, driver1, engine1, 20000);

        double weight = lorry1.getWeight();
        assert weight > 0;
        double power = lorry1.getEnginePower();
        assert power > 0;
        int drivingExperience = driver1.getDrivingExperience();
        assert drivingExperience > 0;
        double bodyLiftingCapacity = lorry1.getBodyLiftingCapacity();
        assert bodyLiftingCapacity > 0;
    }

    public static void sportCarTest() {
        Engine engine1 = new Engine("Volkswagen", 120);
        Driver driver1 = new Driver("Li Ming", 40, 20);
        SportCar sportCar1 = new SportCar("BMW", 700, driver1, engine1, 240);

        double weight = sportCar1.getWeight();
        assert weight > 0;
        double power = sportCar1.getEnginePower();
        assert power > 0;
        int drivingExperience = driver1.getDrivingExperience();
        assert drivingExperience > 0;
        double maxSpeed = sportCar1.getMaxSpeed();
        assert maxSpeed > 0;
    }
}
