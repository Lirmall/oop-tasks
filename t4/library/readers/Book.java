package oop.tasks.t4.library.readers;

//создать новый класс, содержащий имя и автора книги
public class Book {
    protected String bookAutor;
    protected String bookName;

    protected Book (String bookAutor, String bookName) {
        this.bookAutor = bookAutor;
        this.bookName = bookName;
    }
}
