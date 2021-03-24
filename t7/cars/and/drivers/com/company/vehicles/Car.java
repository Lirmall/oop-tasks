package oop.tasks.t7.cars.and.drivers.com.company.vehicles;

/*Класс Car содержит поля - марка автомобиля,
класс автомобиля,
вес,
водитель типа Driver,
мотор типа Engine.
Методы start(), stop(), turnRight(), turnLeft(),
которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо"
или "Поворот налево".
А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 */


import oop.tasks.t7.cars.and.drivers.com.company.details.Engine;
import oop.tasks.t7.cars.and.drivers.com.company.professions.Driver;

public class Car {
    String markOfAuto;
    double weight;
    String driverName;
    int driverDrivingExpirience;
    String engineManufacturer;
    double enginePower;

    public Car(String markOfAuto, double weight, Driver driver, Engine engine) {
        this.markOfAuto = markOfAuto;
        this.weight = weight;
        this.driverName = driver.fullName;

    }

    String start() {
        return "Поехали";
    }

    String stop() {
        return "Останавливаемся";
    }

    String turnLeft() {
        return "Поворот налево";
    }

    String turnRight() {
        return "Поворот направо";
    }

    String printInfo() {
        System.out.println(this.markOfAuto);
        System.out.println(this.weight);
        System.out.println(this.);
    }

}
