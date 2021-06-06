package oop.tasks.string4;

public class MiddleChars {
    private final String string;

    public MiddleChars(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public String middleChars(String s) {
        String result;
        int i = s.length();

        char[] l = new char[]{s.charAt((i / 2) - 1), s.charAt(i / 2)};

        result = new String(l);
        return result;
    }

}
