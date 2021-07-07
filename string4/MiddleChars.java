package oop.tasks.string4;

public class MiddleChars {
    private final String string;

    public MiddleChars(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }

    public String middleChars() {
        String word = this.getString();
        String result = null;
        int i = word.length();

        if (i == 0) {
            result = "";
        }

        if (i > 1 && i % 2 == 0) {
            char[] l = new char[]{word.charAt((i / 2) - 1), word.charAt(i / 2)};

            result = new String(l);
        }

        if (i % 2 != 0) {
            result = String.valueOf(word.charAt(word.length() / 2));
        }

        return result;
    }

}
