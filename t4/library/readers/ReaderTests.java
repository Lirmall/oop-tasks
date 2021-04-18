package oop.tasks.t4.library.readers;

public class ReaderTests {
    public static void main(String[] args) throws IncorrectLibraryCardNumber, IncorrectPhoneNumber,
            IncorrectNumberOfBooks {
        testLibraryCardNumber();
        testPhoneNumber();
        testNumberOfBooks();
    }

    private static void testLibraryCardNumber() throws IncorrectPhoneNumber {
        try {
            Reader reader1 = new Reader(
                    "Ivanov I.I.",
                    -19,
                    "Computer science",
                    "17.12.2011",
                    12476);
        } catch (IncorrectLibraryCardNumber e) {
            return;
        }
        assert false;
    }

    private static void testPhoneNumber() throws IncorrectLibraryCardNumber {
        try {
            Reader reader1 = new Reader(
                    "Ivanov I.I.",
                    19,
                    "Computer science",
                    "17.12.2011",
                    -12476);
        } catch (IncorrectPhoneNumber e) {
            return;
        }
        assert false;
    }

    private static void testNumberOfBooks() throws IncorrectPhoneNumber, IncorrectLibraryCardNumber {
        try {
            Reader reader1 = new Reader(
                    "Ivanov I.I.",
                    19,
                    "Computer science",
                    "17.12.2011",
                    12476);

            reader1.takeBook(-6);
        } catch (IncorrectNumberOfBooks e) {
            assert false;
        }
    }
}
