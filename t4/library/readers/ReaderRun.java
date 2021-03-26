package oop.tasks.t4.library.readers;

public class ReaderRun {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов И.И.", 19, "Информатика", "17.12.2011", 12476);
        Reader reader2 = new Reader("Петров П.А.", 12, "Биология", "15.06.2012", 12611);
        Reader reader3 = new Reader("Сидоров И.Г.", 96, "География", "25.08.2008", 12412);

        Book book1 = new Book("Г.Шилдт", "Java 8. Полное издание");
        Book book2 = new Book("В.И.Вернадский", "Ноосфера");
        Book book3 = new Book("Р.Л.Стивенсон", "Остров сокровищ");

        System.out.println("Readers:");
        System.out.println(reader1.getFullName() + ", " + " дата рождения: " + reader1.getBornDate() + ", " +" факультет: "
                + reader1.getFaculty() + ", " + "номер читательского билета: " + reader1.getReaderTicket()
                + ", "+ "контактный номер телефона: " + reader1.getPhoneNumber());

        System.out.println(reader2.getFullName() + ", " + " дата рождения: " + reader2.getBornDate() + ", " +" факультет: "
                + reader2.getFaculty() + ", " + "номер читательского билета: " + reader2.getReaderTicket()
                + ", "+ "контактный номер телефона: " + reader2.getPhoneNumber());

        System.out.println(reader3.getFullName() + ", " + " дата рождения: " + reader3.getBornDate() + ", " +" факультет: "
                + reader3.getFaculty() + ", " + "номер читательского билета: " + reader3.getReaderTicket()
                + ", "+ "контактный номер телефона: " + reader3.getPhoneNumber());
        System.out.println();

        reader1.takeBook(5);
        reader2.takeBook(3);
        reader3.takeBook(21);
        System.out.println();

        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println();

        reader1.takeBook(book1);
        reader2.takeBook(book1, book3);
        reader3.takeBook(book2, book3);
        System.out.println();

        reader1.returnBook(5);
        reader2.returnBook(3);
        reader1.returnBook(21);
        System.out.println();

        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        System.out.println();

        reader1.returnBook(book1);
        reader2.returnBook(book1, book3);
        reader3.returnBook(book2, book3);
    }
}
