package oop.tasks.t1.phone.tasks;

public class PhoneRun {
    public static void main(String[] args) {

        Phone phone1 = new Phone(12, "nokia 3110", 89);
        Phone phone2 = new Phone(14, "motorola v3", 45);
        Phone phone3 = new Phone(19, "siemens a65", 49);
        Phone phone4 = new Phone();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println(phone4.getNumber());
        System.out.println();

        System.out.println("Номер " + phone1.getNumber() + " модель " + phone1.getModel() + " вес " + phone1.getWeight());
        System.out.println("Номер " + phone2.getNumber() + " модель " + phone2.getModel() + " вес " + phone2.getWeight());
        System.out.println("Номер " + phone3.getNumber() + " модель " + phone3.getModel() + " вес " + phone3.getWeight());
        System.out.println("Номер " + phone4.getNumber() + " модель " + phone4.getModel() + " вес " + phone4.getWeight());
        System.out.println();

        phone1.receiveCall("Первый");
        phone2.receiveCall("Второй");
        phone3.receiveCall("Третий");
        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println();

        phone1.receiveCall("Первый", phone1.getNumber());
        phone2.receiveCall("Второй", phone2.getNumber());
        phone3.receiveCall("Третий", phone3.getNumber());
        System.out.println();

        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
        System.out.println();
        phone1.sendMessage(phone2.getNumber());
        System.out.println();
        phone1.sendMessage(phone2.getNumber(), 754169, 1254156, 98566952);
        System.out.println();
    }
}
