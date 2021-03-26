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

        System.out.println("����� " + phone1.getNumber() + " ������ " + phone1.getModel() + " ��� " + phone1.getWeight());
        System.out.println("����� " + phone2.getNumber() + " ������ " + phone2.getModel() + " ��� " + phone2.getWeight());
        System.out.println("����� " + phone3.getNumber() + " ������ " + phone3.getModel() + " ��� " + phone3.getWeight());
        System.out.println("����� " + phone4.getNumber() + " ������ " + phone4.getModel() + " ��� " + phone4.getWeight());
        System.out.println();

        phone1.receiveCall("������");
        phone2.receiveCall("������");
        phone3.receiveCall("������");
        System.out.println();

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println();

        phone1.receiveCall("������", phone1.getNumber());
        phone2.receiveCall("������", phone2.getNumber());
        phone3.receiveCall("������", phone3.getNumber());
        System.out.println();

        phone1.sendMessage(phone2.getNumber(), phone3.getNumber());
        System.out.println();
        phone1.sendMessage(phone2.getNumber());
        System.out.println();
        phone1.sendMessage(phone2.getNumber(), 754169, 1254156, 98566952);
        System.out.println();
    }
}
