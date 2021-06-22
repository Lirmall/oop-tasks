package oop.tasks.string3;

public class StringReplacementRun {
    public static void main(String[] args) {

        StringReplacement srp = new StringReplacement("Object-oriented programming is a programming language model " +
                " organized around objects rather than actions and data rather than logic. " + "\n" +
                "Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming bla-bla");

        String str2 = "Object-oriented programming";
        String str3 = "OOP";

        String str1 = srp.getString();
        System.out.println(str1 + "\n");
        System.out.println(srp.getString().length());

        System.out.println(srp.replacement1("Object-oriented programming", "OOP") + "\n");

        System.out.println(srp.replacement1(str2, str3));
    }
}
