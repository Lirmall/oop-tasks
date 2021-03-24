package oop.tasks.t4.library.readers;

/* Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
ФИО, номер читательского билета, факультет, дата рождения, телефон.
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

/* takeBook, который будет принимать количество взятых книг.
Выводит на консоль сообщение "Петров В. В. взял 3 книги".
 */

    protected void takeBook(int i) {
        String word = "книги";
        if (i % 10 == 1) {
            word = "книгу";
        }

        if (i % 10 > 1 && i % 10 < 5) {
            word = "книги";
        }

        if (i % 10 >= 5 || i > 10 && i < 20) {
            word = "книг";
        }

        System.out.println(this.fullName + " взял " + i + " " + word);
    }

    /*takeBook, который будет принимать переменное количество названий книг.
    Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
     */
    protected void takeBook(String... bookName) {
        System.out.print(this.fullName + " взял ");
        for (String i : bookName) {
            System.out.print(i + ", ");
        }
        System.out.println(".");
    }

    //takeBook, который будет принимать переменное количество объектов класса Book
    protected void takeBook(Book... books) {
        System.out.print(this.fullName + " взял ");
        for (Book i : books) {
            System.out.print(i.bookName + ", ");
        }
        System.out.println(".");
    }

    //Аналогичным образом перегрузить метод returnBook().
    protected void returnBook(int i) {
        String word = "книги";
        if (i % 10 == 1) {
            word = "книгу";
        }

        if (i % 10 > 1 && i % 10 < 5) {
            word = "книги";
        }

        if (i % 10 >= 5 || i > 10 && i < 20) {
            word = "книг";
        }

        System.out.println(this.fullName + " вернул " + i + " " + word);
    }

    protected void returnBook(String... bookName) {
        System.out.print(this.fullName + " вернул ");
        for (String i : bookName) {
            System.out.print(i + ", ");
        }
        System.out.println(".");
    }

    protected void returnBook(Book... books) {
        System.out.print(this.fullName + " вернул ");
        for (Book i : books) {
            System.out.print(i.bookName + ", ");
        }
        System.out.println(".");
    }
}
