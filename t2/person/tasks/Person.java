package oop.tasks.t2.person.tasks;

class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = null;
        this.age = 0;
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

    public void move() {
        System.out.println(getFullName() + " ходит");
    }

    public void talk() {
        System.out.println(getFullName() + " говорит");
    }
}
