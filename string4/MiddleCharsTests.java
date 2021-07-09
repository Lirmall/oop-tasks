package oop.tasks.string4;

public class MiddleCharsTests {
    public static void main(String[] args) {
        testMiddleCharsEvenString();
        testMiddleCharsOddString();
        testMiddleCharsEmptyString();
    }

    public static void testMiddleCharsEvenString() {
        MiddleChars str1 = new MiddleChars("12344321");
        assert str1.middleChars().equals("44");
    }

    public static void testMiddleCharsOddString() {
        MiddleChars str2 = new MiddleChars("12321");
        assert str2.middleChars().equals("3");
    }

    public static void testMiddleCharsEmptyString() {
        MiddleChars str3 = new MiddleChars("");
        assert str3.middleChars().equals("");
    }
}
