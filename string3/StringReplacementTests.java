package oop.tasks.string3;

public class StringReplacementTests {
    public static void main(String[] args) {
        replacement1Test();
        replacement2Test();
    }

    static void replacement1Test() {
        StringReplacement srp = new StringReplacement("Object-oriented programming is a programming language model " +
                " organized around objects rather than actions and data rather than logic. " + "\n" +
                "Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming bla-bla");

        String str1 = "Object-oriented programming is a programming language model  organized around objects rather than actions and data rather than logic. \n" +
                "OOP blabla. Object-oriented programming bla. OOP bla-bla";

        String str2 = srp.replacement("Object-oriented programming", "OOP");
        assert str2.equals(str1);

    }

    static void replacement2Test() {
        StringReplacement srp = new StringReplacement("Object-oriented programming is a programming language model " +
                " organized around objects rather than actions and data rather than logic. " + "\n" +
                "Object-oriented programming blabla. Object-oriented programming bla. Object-oriented programming bla-bla");

        String str2 = "Object-oriented programming";
        String str3 = "OOP";
        String str4 = "Object-oriented programming is a programming language model  organized around objects rather than actions and data rather than logic. \n" +
                "OOP blabla. Object-oriented programming bla. OOP bla-bla";

        String str1 = srp.replacement(str2, str3);
        assert str1.equals(str4);
    }
}
