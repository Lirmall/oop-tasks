package oop.tasks.t7.cars.and.drivers.com.company.professions;

public class Driver extends Person {
    int drivingExperience;

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public String getDriverInfo() {
        return "��� ��������: " + getFullName() + " �������: " + getAge() + ", ���� ��������: " + getDrivingExperience() + ".";
    }
}
