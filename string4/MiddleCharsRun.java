package oop.tasks.string4;

public class MiddleCharsRun {
    public static void main(String[] args) {
        MiddleChars str1 = new MiddleChars("12344321");
        MiddleChars str2 = new MiddleChars("123321");
        MiddleChars str3 = new MiddleChars("1234554321");

        System.out.println("Starting line with an even number of characters: " + str1.getString());
        System.out.println("Middle line characters: " + str1.middleChars(str1.getString()) + "\n");

        System.out.println("Starting line with an even number of characters: " + str2.getString());
        System.out.println("Middle line characters: " + str2.middleChars(str2.getString()) + "\n");

        System.out.println("Starting line with an even number of characters: " + str3.getString());
        System.out.println("Middle line characters: " + str3.middleChars(str3.getString()) + "\n");
    }
}
