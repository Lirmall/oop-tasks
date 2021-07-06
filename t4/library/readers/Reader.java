package oop.tasks.t4.library.readers;

class Reader {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private int phoneNumber;

    public Reader() {
    }

    public Reader(String fullName, String faculty, String dateOfBirth) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
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

    public void setLibraryCardNumber(int libraryCardNumber) throws IncorrectLibraryCardNumberException {
        if (libraryCardNumber < 0) {
            throw new IncorrectLibraryCardNumberException();

        } else {
            this.libraryCardNumber = libraryCardNumber;
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

    public void setPhoneNumber(int phoneNumber) throws IncorrectPhoneNumberException {
        this.phoneNumber = phoneNumber;
        if (phoneNumber < 0) {
            throw new IncorrectPhoneNumberException();
        }
    }

    public void takeBook(int numberOfBooks) throws IncorrectNumberOfBooksException {
        String word = "books";
        if (numberOfBooks == 1) {
            word = "book";
        }

        if (numberOfBooks > 1) {
            word = "books";
        }

        if (numberOfBooks < 0) {
            throw new IncorrectNumberOfBooksException();
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

    public void returnBook(int numberOfBooks) throws IncorrectNumberOfBooksException {
        String word = "books";
        if (numberOfBooks == 1) {
            word = "book";
        }

        if (numberOfBooks > 1) {
            word = "books";
        }

        if (numberOfBooks < 0) {
            throw new IncorrectNumberOfBooksException();
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

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", libraryCardNumber=" + libraryCardNumber +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
