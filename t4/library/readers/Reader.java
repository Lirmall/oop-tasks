package oop.tasks.t4.library.readers;

/* ���������� ����� Reader, �������� ����� ���������� � ������������ ����������:
���, ����� ������������� ������, ���������, ���� ��������, �������.
 */
class Reader {
    protected String fullName;
    protected int readerTicket;
    protected String faculty;
    protected String bornDate;
    protected int phoneNumber;

    protected Reader(String fullName, int readerTicket, String faculty, String bornDate, int phoneNumber) {
        this.fullName = fullName;
        this.readerTicket = readerTicket;
        this.faculty = faculty;
        this.bornDate = bornDate;
        this.phoneNumber = phoneNumber;
    }

/* takeBook, ������� ����� ��������� ���������� ������ ����.
������� �� ������� ��������� "������ �. �. ���� 3 �����".
 */

    protected void takeBook(int i) {
        String word = "�����";
        if (i % 10 == 1) {
            word = "�����";
        }

        if (i % 10 > 1 && i % 10 < 5) {
            word = "�����";
        }

        if (i % 10 >= 5 || i > 10 && i < 20) {
            word = "����";
        }

        System.out.println(this.fullName + " ���� " + i + " " + word);
    }

    /*takeBook, ������� ����� ��������� ���������� ���������� �������� ����.
    ������� �� ������� ��������� "������ �. �. ���� �����: �����������, �������, ������������".
     */
    protected void takeBook(String... bookName) {
        System.out.print(this.fullName + " ���� ");
        for (String i : bookName) {
            System.out.print(i + ", ");
        }
        System.out.println(".");
    }

    //takeBook, ������� ����� ��������� ���������� ���������� �������� ������ Book
    protected void takeBook(Book... books) {
        System.out.print(this.fullName + " ���� ");
        for (Book i : books) {
            System.out.print(i.bookName + ", ");
        }
        System.out.println(".");
    }

    //����������� ������� ����������� ����� returnBook().
    protected void returnBook(int i) {
        String word = "�����";
        if (i % 10 == 1) {
            word = "�����";
        }

        if (i % 10 > 1 && i % 10 < 5) {
            word = "�����";
        }

        if (i % 10 >= 5 || i > 10 && i < 20) {
            word = "����";
        }

        System.out.println(this.fullName + " ������ " + i + " " + word);
    }

    protected void returnBook(String... bookName) {
        System.out.print(this.fullName + " ������ ");
        for (String i : bookName) {
            System.out.print(i + ", ");
        }
        System.out.println(".");
    }

    protected void returnBook(Book... books) {
        System.out.print(this.fullName + " ������ ");
        for (Book i : books) {
            System.out.print(i.bookName + ", ");
        }
        System.out.println(".");
    }
}
