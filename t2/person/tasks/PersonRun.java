package oop.tasks.t2.person.tasks;

public class PersonRun {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иванов Иван Иванович", 42);

        System.out.println(person1.fullName + "," + " " + person1.age);
        System.out.println(person2.fullName + "," + " " + person2.age);

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
