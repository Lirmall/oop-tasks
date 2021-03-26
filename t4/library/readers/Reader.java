package oop.tasks.t4.library.readers;

class Reader {
    private String fullName;
    private int readerTicket;
    private String faculty;
    private String bornDate;
    private int phoneNumber;

    public Reader(String fullName, int readerTicket, String faculty, String bornDate, int phoneNumber) {
        this.fullName = fullName;
        this.readerTicket = readerTicket;
        this.faculty = faculty;
        this.bornDate = bornDate;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public int getReaderTicket() {
        return readerTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBornDate() {
        return bornDate;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        String word = "книги";
        if (numberOfBooks % 10 == 1) {
            word = "книгу";
        }

        if (numberOfBooks % 10 > 1 && numberOfBooks % 10 < 5) {
            word = "книги";
        }

        if (numberOfBooks % 10 >= 5 || numberOfBooks > 10 && numberOfBooks < 20) {
            word = "книг";
        }

        System.out.println(this.getFullName() + " взял " + numberOfBooks + " " + word);
    }

    public void takeBook(String... bookNames) {
        System.out.print(this.getFullName() + " взял ");
        for (String i : bookNames) {
            System.out.print(i + ", ");
        }
        System.out.println(".");
    }

    public void takeBook(Book... books) {
        System.out.print(this.getFullName() + " взял ");
        for (Book i : books) {
            System.out.print(i.getBookAuthor() + " " + i.getBookName() + ", ");
        }
        System.out.println(".");
    }

    public void returnBook(int numberOfBooks) {
        String word = "книги";
        if (numberOfBooks % 10 == 1) {
            word = "книгу";
        }

        if (numberOfBooks % 10 > 1 && numberOfBooks % 10 < 5) {
            word = "книги";
        }

        if (numberOfBooks % 10 >= 5 || numberOfBooks > 10 && numberOfBooks < 20) {
            word = "книг";
        }

        System.out.println(this.getFullName() + " вернул " + numberOfBooks + " " + word);
    }

    public void returnBook(String... bookName) {
        System.out.print(this.fullName + " вернул ");
        for (String i : bookName) {
            System.out.print(i + ", ");
        }
        System.out.println(".");
    }

    public void returnBook(Book... books) {
        System.out.print(this.getFullName() + " вернул ");
        for (Book i : books) {
            System.out.print(i.getBookAuthor() + " " + i.getBookName() + ", ");
        }
        System.out.println(".");
    }
}
