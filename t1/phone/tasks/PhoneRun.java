package oop.tasks.t1.phone.tasks;

public class PhoneRun {
    public static void main(String[] args) {
        //�������� ��� ���������� ������ Phone
        Phone phone1 = new Phone(12, "nokia 3110", 89);
        Phone phone2 = new Phone(14, "motorola v3", 45);
        Phone phone3 = new Phone(19, "siemens a65", 49);
        Phone phone4 = new Phone();

        //�������� �� ������� �������� �� ����������.
        System.out.println(phone1.number);
        System.out.println(phone2.number);
        System.out.println(phone3.number);
        System.out.println(phone4.number);
        System.out.println();

        System.out.println("����� " + phone1.number + " ������ " + phone1.model + " ��� " + phone1.weight);
        System.out.println("����� " + phone2.number + " ������ " + phone2.model + " ��� " + phone2.weight);
        System.out.println("����� " + phone3.number + " ������ " + phone3.model + " ��� " + phone3.weight);
        System.out.println("����� " + phone4.number + " ������ " + phone4.model + " ��� " + phone4.weight);
        System.out.println();

        //������� ��� ������ ��� ������� �� ��������.
        phone1.receiveCall("������");
        phone2.receiveCall("������");
        phone3.receiveCall("������");
        System.out.println();

        // ������� ��� ������ ��� ������� �� ��������.
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println();

        //������� ������������� ����� receiveCall c ������ � �������
        phone1.receiveCall("������", phone1.number);
        phone2.receiveCall("������", phone2.number);
        phone3.receiveCall("������", phone3.number);
        System.out.println();

        phone1.sendMessage(phone2.number, phone3.getNumber());
        System.out.println();
        phone1.sendMessage(phone2.number);
        System.out.println();
        phone1.sendMessage(phone2.number, 754169, 1254156, 98566952);
        System.out.println();
    }
}
