package oop.tasks.t4.library.readers;

public class ReaderRun {
    public static void main(String[] args) throws IncorrectLibraryCardNumber, IncorrectPhoneNumber,
            IncorrectNumberOfBooks {
        Reader reader1 = new Reader(
                "Ivanov I.I.",
                19,
                "Computer science",
                "17.12.2011",
                12476);
        Reader reader2 = new Reader(
                "Petrov P.A.",
                12,
                "Biology",
                "15.06.2012",
                12611);
        Reader reader3 = new Reader(
                "Sidorov I.G.",
                96,
                "Geography",
                "25.08.2008",
                12412);

        Book book1 = new Book("G.Scildt", "Java 8. Complete edition");
        Book book2 = new Book("V.I.Vernadskii`", "Noosphere");
        Book book3 = new Book("R.L. Stevenson", "Treasure island");

        System.out.println("Readers:");
        System.out.println(reader1.getFullName() + ", " + "born date: " + reader1.getDateOfBirth() + ", " + "faculty: "
                + reader1.getFaculty() + ", " + "library card number: " + reader1.getLibraryCardNumber()
                + ", " + "contact phone number: " + reader1.getPhoneNumber());

        System.out.println(reader2.getFullName() + ", " + " born date: " + reader2.getDateOfBirth() + ", " + "faculty: "
                + reader2.getFaculty() + ", " + "library card number: " + reader2.getLibraryCardNumber()
                + ", " + "contact phone number: " + reader2.getPhoneNumber());

        System.out.println(reader3.getFullName() + ", " + "born date: " + reader3.getDateOfBirth() + ", " + "faculty: "
                + reader3.getFaculty() + ", " + "library card number: " + reader3.getLibraryCardNumber()
                + ", " + "contact phone number: " + reader3.getPhoneNumber());
        System.out.println();

        reader1.takeBook(5);
        reader2.takeBook(3);
        reader3.takeBook(21);
        System.out.println();

        reader1.takeBook("Adventures", "Vocabulary", "Encyclopedia");
        System.out.println();

        reader1.takeBook(book1);
        reader2.takeBook(book1, book3);
        reader3.takeBook(book2, book3);
        System.out.println();

        reader1.returnBook(5);
        reader2.returnBook(3);
        reader1.returnBook(21);
        System.out.println();

        reader1.returnBook("Adventures", "Vocabulary", "Encyclopedia");
        System.out.println();

        reader1.returnBook(book1);
        reader2.returnBook(book1, book3);
        reader3.returnBook(book2, book3);
    }
}
