package oop.tasks.t7.cars.and.drivers.com.company.professions;

class Person {
    String fullName;
    int age;

    void move() {
        System.out.println("Такой-то Person ходит");
    }
    void talk() {
        System.out.println("Такой-то Person говорит");
    }

    Person() {
        this.fullName = null;
        this.age = 0;
    }
    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


}
