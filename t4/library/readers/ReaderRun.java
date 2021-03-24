package oop.tasks.t4.library.readers;

public class ReaderRun {
    public static void main(String[] args) {
        Reader reader1 = new Reader("������ �.�.", 19, "�����������", "17.12.2011", 12476);
        Reader reader2 = new Reader("������ �.�.", 12, "��������", "15.06.2012", 12611);
        Reader reader3 = new Reader("������� �.�.", 96, "���������", "25.08.2008", 12412);

        Book book1 = new Book("�.�����", "Java 8. ������ �������");
        Book book2 = new Book("�.�.����������", "��������");
        Book book3 = new Book("�.�.���������", "������ ��������");

        System.out.println();

        reader1.takeBook(5);
        reader2.takeBook(3);
        reader3.takeBook(21);

        System.out.println();

        reader1.takeBook("�����������", "�������", "������������");

        System.out.println();

        reader1.takeBook(book1);
        reader2.takeBook(book1, book3);
        reader3.takeBook(book2, book3);

        System.out.println();

        reader1.returnBook(5);
        reader2.returnBook(3);
        reader1.returnBook(21);

        System.out.println();

        reader1.returnBook("�����������", "�������", "������������");

        System.out.println();

        reader1.returnBook(book1);
        reader2.returnBook(book1, book3);
        reader3.returnBook(book2, book3);

        System.out.println();
    }
}
