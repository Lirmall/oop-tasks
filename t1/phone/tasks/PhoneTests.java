package oop.tasks.t1.phone.tasks;

public class PhoneTests {
    public static void main(String[] args) throws IncorrectNumber, IncorrectWeight {
        testPhone();
        testGetNumber();
        testSendMessage();
        testIncorrectNumber();
        testIncorrectWeight();
        System.out.println();
    }

    private static void testPhone() throws IncorrectNumber, IncorrectWeight {
        Phone phone1 = new Phone(121354, "siemens", 76.0);
        int number = phone1.getNumber();
        assert number > 0;
        double weight = phone1.getWeight();
        assert weight > 0;
    }

    private static void testIncorrectNumber() throws IncorrectWeight {
        try {
            Phone phone1 = new Phone(-121354, "siemens", 76.0);
        } catch (IncorrectNumber e) {
            return;
        }
        assert false;
    }

    private static void testIncorrectWeight() throws IncorrectNumber {
        try {
            Phone phone1 = new Phone(121354, "siemens", -76.0);
        } catch (IncorrectWeight e) {
            return;
        }
        assert false;
    }

    private static void testGetNumber() throws IncorrectNumber, IncorrectWeight {
        Phone phone1 = new Phone(121354, "siemens", 76.0);
        int number = phone1.getNumber();
        assert number > 0;
    }

    private static void testSendMessage() throws IncorrectNumber, IncorrectWeight {
        Phone phone1 = new Phone(121354, "siemens", 76.0);
        int number = phone1.getNumber();
        assert number > 0;
    }
}
