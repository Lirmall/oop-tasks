package oop.tasks.t7.cars.and.drivers.com.company.professions;

class Person {
    private String fullName;
    private int age;

    void move() {
        System.out.println("�����-�� Person �����");
    }
    void talk() {
        System.out.println("�����-�� Person �������");
    }

    public Person() {
        this.fullName = null;
        this.age =0;
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
