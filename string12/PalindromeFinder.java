package oop.tasks.string12;

public abstract class PalindromeFinder {
    private String string;

    public PalindromeFinder(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }

    public abstract String palindromeFind();
}

