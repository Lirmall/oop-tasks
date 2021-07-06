package oop.tasks.t4.library.readers;

public class Book {
    private String author;
    private String name;

    public Book(String author, String name) {
        this.setAuthor(author);
        this.setName(name);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
