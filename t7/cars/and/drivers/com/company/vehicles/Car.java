package oop.tasks.t7.cars.and.drivers.com.company.vehicles;

/*����� Car �������� ���� - ����� ����������,
����� ����������,
���,
�������� ���� Driver,
����� ���� Engine.
������ start(), stop(), turnRight(), turnLeft(),
������� ������� �� ������: "�������", "���������������", "������� �������"
��� "������� ������".
� ����� ����� printInfo(), ������� ������� ������ ���������� �� ����������, �� �������� � ������.
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
        return "�������";
    }

    String stop() {
        return "���������������";
    }

    String turnLeft() {
        return "������� ������";
    }

    String turnRight() {
        return "������� �������";
    }

    String printInfo() {
        System.out.println(this.markOfAuto);
        System.out.println(this.weight);
        System.out.println(this.);
    }

}
