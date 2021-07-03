package oop.tasks.string1;

public class StringMethodsPracticeRun {
    public static void main(String[] args) {
        StringMethodsPractice str = new StringMethodsPractice("I like Java!!!");

        String s = str.getString();
        System.out.println();

        System.out.println("Initial String: " + "'" + s + "'");
        System.out.println();

        System.out.println("The string s ends with the char " + "'" + s.charAt(s.length() - 1) + "'");
        System.out.println();

        if (s.endsWith("!!!")) {
            System.out.println("The string s ends with the chars '!!!'");
        }
        System.out.println();

        if (s.startsWith("I like")) {
            System.out.println("The string s starts with the chars 'I like'");
        }
        System.out.println();

        if (s.contains("Java")) {
            System.out.println("The string s contains 'Java'");
        }
        System.out.println();

        System.out.println("The position of the word Java in the String is " + s.indexOf("Java"));
        System.out.println();

        System.out.println("The string after replacing 'a' with 'o': " + s.replace('a', 'o'));
        System.out.println();

        System.out.println("The string after the case is increased: " + s.toUpperCase());
        System.out.println();

        System.out.println("The string after lowering the case: " + s.toLowerCase());
        System.out.println();

        System.out.println("Cutting out the word 'Java' from a string: " +  s.substring(s.indexOf('J'), s.indexOf('!')));
    }
}
