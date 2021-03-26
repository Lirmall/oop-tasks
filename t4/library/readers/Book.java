package oop.tasks.t4.library.readers;

public class Book {
    private String bookAuthor;
    private String bookName;

    public Book (String bookAuthor, String bookName) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }
}
