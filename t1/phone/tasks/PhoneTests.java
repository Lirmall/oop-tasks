package oop.tasks.t1.phone.tasks;

public class PhoneTests {
    public static void main(String[] args) {
        testPhone();
        testGetNumber();
        testSendMessage();
        System.out.println();
    }

    public static void testPhone() {
        Phone phone1 = new Phone(121354, "siemens", 76.0);
        int number = phone1.getNumber();
        assert number > 0;
        double weight = phone1.getWeight();
        assert weight > 0;
    }

    public static void testGetNumber() {
        Phone phone1 = new Phone(121354, "siemens", 76.0);
        int number = phone1.getNumber();
        assert number > 0;
    }

    public static void testSendMessage() {
        Phone phone1 = new Phone(121354, "siemens", 76.0);
        int number = phone1.getNumber();
        assert number > 0;
    }
}
