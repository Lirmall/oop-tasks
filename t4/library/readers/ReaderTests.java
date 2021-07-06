package oop.tasks.t4.library.readers;

public class ReaderTests {
    public static void main(String[] args) throws IncorrectLibraryCardNumberException, IncorrectPhoneNumberException,
            IncorrectNumberOfBooksException {
        testLibraryCardNumber();
        testPhoneNumber();
        testNumberOfBooks();
        testPhoneNumber2();
    }

    private static void testLibraryCardNumber() throws IncorrectPhoneNumberException {
        try {
            Reader reader1 = new Reader(
                    "Ivanov I.I.",
                    "Computer science",
                    "17.12.2011");
            reader1.setLibraryCardNumber(19);
            reader1.setPhoneNumber(12476);
        } catch (IncorrectLibraryCardNumberException e) {
            return;
        }
        assert false;
    }

    private static void testPhoneNumber() throws IncorrectLibraryCardNumberException {
        try {
            Reader reader1 = new Reader(
                    "Ivanov I.I.",
                    "Computer science",
                    "17.12.2011");
            reader1.setLibraryCardNumber(19);
            reader1.setPhoneNumber(12476);
        } catch (IncorrectPhoneNumberException e) {
            return;
        }
        assert false;
    }

    private static void testNumberOfBooks() throws IncorrectPhoneNumberException, IncorrectLibraryCardNumberException {
        try {
            Reader reader1 = new Reader(
                    "Ivanov I.I.",
                    "Computer science",
                    "17.12.2011");
            reader1.setLibraryCardNumber(19);
            reader1.setPhoneNumber(12476);

            reader1.takeBook(-6);
        } catch (IncorrectNumberOfBooksException e) {
            return;
        }
        assert false;
    }

    private static void testPhoneNumber2() throws IncorrectLibraryCardNumberException {
        Reader reader1 = null;
        try {
             reader1 = new Reader(
                    "Ivanov I.I.",
                    "Computer science",
                    "17.12.2011");
            reader1.setLibraryCardNumber(19);
            reader1.setPhoneNumber(12476);
        } catch (IncorrectPhoneNumberException e) {
            //Некорректный номер телефона
        }
        if (reader1 != null) {
            int phoneNumber = reader1.getPhoneNumber();
            System.out.println(reader1);
            assert phoneNumber > 0;
        } else {
            assert false;
        }
    }
}
