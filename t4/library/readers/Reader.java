package oop.tasks.t4.library.readers;

class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private int phoneNumber;

    public Reader(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, int phoneNumber)
            throws IncorrectLibraryCardNumber, IncorrectPhoneNumber {
        this.setFullName(fullName);
        this.setLibraryCardNumber(libraryCardNumber);
        this.setFaculty(faculty);
        this.setDateOfBirth(dateOfBirth);
        this.setPhoneNumber(phoneNumber);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) throws IncorrectLibraryCardNumber {
        this.libraryCardNumber = libraryCardNumber;
        if (libraryCardNumber < 0) {
            throw new IncorrectLibraryCardNumber();
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) throws IncorrectPhoneNumber {
        this.phoneNumber = phoneNumber;
        if (phoneNumber < 0) {
            throw new IncorrectPhoneNumber();
        }
    }

    public void takeBook(int numberOfBooks) throws IncorrectNumberOfBooks {
        String word = "books";
        if (numberOfBooks == 1) {
            word = "book";
        }

        if (numberOfBooks > 1) {
            word = "books";
        }

        if (numberOfBooks < 0) {
            throw new IncorrectNumberOfBooks();
        }

        System.out.println(this.getFullName() + " took " + numberOfBooks + " " + word);
    }

    public void takeBook(String... bookNames) {
        System.out.print(this.getFullName() + " took ");
        for (String i : bookNames) {
            System.out.print(i + ", ");
        }
        System.out.println(".");
    }

    public void takeBook(Book... books) {
        System.out.print(this.getFullName() + " took ");
        for (Book i : books) {
            System.out.print(i.getAuthor() + " " + i.getName() + ", ");
        }
        System.out.println(".");
    }

    public void returnBook(int numberOfBooks) throws IncorrectNumberOfBooks {
        String word = "books";
        if (numberOfBooks == 1) {
            word = "book";
        }

        if (numberOfBooks > 1) {
            word = "books";
        }

        if (numberOfBooks < 0) {
            throw new IncorrectNumberOfBooks();
        }

        System.out.println(this.getFullName() + " returned " + numberOfBooks + " " + word);
    }

    public void returnBook(String... bookName) {
        System.out.print(this.getFullName() + " returned ");
        for (String i : bookName) {
            System.out.print(i + ", ");
        }
        System.out.println(".");
    }

    public void returnBook(Book... books) {
        System.out.print(this.getFullName() + " returned ");
        for (Book i : books) {
            System.out.print(i.getAuthor() + " " + i.getName() + ", ");
        }
        System.out.println(".");
    }
}
