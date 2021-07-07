package oop.tasks.t1.phone.tasks;

public class PhoneRun {
    public static void main(String[] args) throws IncorrectNumber, IncorrectWeight {

        Phone phone1 = new Phone(12, "nokia 3110", 89);
        Phone phone2 = new Phone(14, "motorola v3", 45);
        Phone phone3 = new Phone(19, "siemens a65", 49);
        Phone phone4 = new Phone();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println(phone4.getNumber());
        System.out.println();

        System.out.println("Number " + phone1.getNumber() + " model " + phone1.getModel() + " weight " + phone1.getWeight());
        System.out.println("Number " + phone2.getNumber() + " model " + phone2.getModel() + " weight " + phone2.getWeight());
        System.out.println("Number " + phone3.getNumber() + " model " + phone3.getModel() + " weight " + phone3.getWeight());
        System.out.println("Number " + phone4.getNumber() + " model " + phone4.getModel() + " weight " + phone4.getWeight());
        System.out.println();

        phone1.receiveCall("First");
        phone2.receiveCall("Second");
        phone3.receiveCall("Third");
        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println();

        phone1.receiveCall("First", phone1.getNumber());
        phone2.receiveCall("Second", phone2.getNumber());
        phone3.receiveCall("Third", phone3.getNumber());
        System.out.println();

        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
        System.out.println();
        phone1.sendMessage(phone2.getNumber());
        System.out.println();
        phone1.sendMessage(phone2.getNumber(), 754169, 1254156, 98566952);
        System.out.println();
    }
}
