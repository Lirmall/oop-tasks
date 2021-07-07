package oop.tasks.t7.cars.and.drivers.com.company;

import oop.tasks.t7.cars.and.drivers.com.company.details.Engine;
import oop.tasks.t7.cars.and.drivers.com.company.professions.Driver;
import oop.tasks.t7.cars.and.drivers.com.company.vehicles.Car;
import oop.tasks.t7.cars.and.drivers.com.company.vehicles.Lorry;
import oop.tasks.t7.cars.and.drivers.com.company.vehicles.SportCar;

public class CarRun {
    public static void main(String[] args) {

        Engine engine1 = new Engine("Volkswagen", 120);
        Engine engine2 = new Engine("BMW", 240);
        Engine engine3 = new Engine("KamAz", 500);

        Driver driver1 = new Driver("Li Ming", 40, 20);
        Driver driver2 = new Driver("Eddie Flin", 53, 35);
        Driver driver3 = new Driver("Ivan Gerasimov", 45, 28);

        Car car1 = new Car("Ford", 800, "John Will", 15, "Ford", 45);
        Car car2 = new Car("Toyota", 650, driver1, engine1);

        Lorry lorry1 = new Lorry("Man", 2500, driver3, engine3, 20000);

        SportCar sportCar1 = new SportCar("BMW", 700, driver2, engine2, 240);

        System.out.println(driver1.getDriverInfo());
        System.out.println(driver2.getDriverInfo());
        System.out.println(driver3.getDriverInfo());
        System.out.println();

        System.out.println(car1.printInfo());
        System.out.println(car2.printInfo());
        System.out.println(lorry1.printInfo());
        System.out.println(sportCar1.printInfo());
        System.out.println();

        System.out.println(car1.start());
        System.out.println(car2.start());
        System.out.println(lorry1.start());
        System.out.println(sportCar1.start());
        System.out.println();

        System.out.println(car1.turnLeft());
        System.out.println(car2.turnLeft());
        System.out.println(lorry1.turnLeft());
        System.out.println(sportCar1.turnLeft());
        System.out.println();

        System.out.println(car1.turnRight());
        System.out.println(car2.turnRight());
        System.out.println(lorry1.turnRight());
        System.out.println(sportCar1.turnRight());
        System.out.println();

        System.out.println(car1.stop());
        System.out.println(car2.stop());
        System.out.println(lorry1.stop());
        System.out.println(sportCar1.stop());
    }
}
