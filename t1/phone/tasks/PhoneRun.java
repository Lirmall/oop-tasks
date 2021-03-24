package oop.tasks.t1.phone.tasks;

public class PhoneRun {
    public static void main(String[] args) {
        //Создайте три экземпляра класса Phone
        Phone phone1 = new Phone(12, "nokia 3110", 89);
        Phone phone2 = new Phone(14, "motorola v3", 45);
        Phone phone3 = new Phone(19, "siemens a65", 49);
        Phone phone4 = new Phone();

        //Выведите на консоль значения их переменных.
        System.out.println(phone1.number);
        System.out.println(phone2.number);
        System.out.println(phone3.number);
        System.out.println(phone4.number);
        System.out.println();

        System.out.println("Номер " + phone1.number + " модель " + phone1.model + " вес " + phone1.weight);
        System.out.println("Номер " + phone2.number + " модель " + phone2.model + " вес " + phone2.weight);
        System.out.println("Номер " + phone3.number + " модель " + phone3.model + " вес " + phone3.weight);
        System.out.println("Номер " + phone4.number + " модель " + phone4.model + " вес " + phone4.weight);
        System.out.println();

        //Вызвать эти методы для каждого из объектов.
        phone1.receiveCall("Первый");
        phone2.receiveCall("Второй");
        phone3.receiveCall("Третий");
        System.out.println();

        // Вызвать эти методы для каждого из объектов.
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        System.out.println();

        //вызвать перегружаемый метод receiveCall c именем и номером
        phone1.receiveCall("Первый", phone1.number);
        phone2.receiveCall("Второй", phone2.number);
        phone3.receiveCall("Третий", phone3.number);
        System.out.println();

        phone1.sendMessage(phone2.number, phone3.getNumber());
        System.out.println();
        phone1.sendMessage(phone2.number);
        System.out.println();
        phone1.sendMessage(phone2.number, 754169, 1254156, 98566952);
        System.out.println();
    }
}
