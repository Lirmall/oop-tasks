package oop.tasks.string7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewRegexDemo2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c*ab");
        Matcher matcher1 = pattern.matcher("cab");
        Matcher matcher2 = pattern.matcher("ccab");
        Matcher matcher3 = pattern.matcher("cccab");
        boolean b1 = matcher1.matches();
        System.out.println(b1);
        boolean b2 = matcher1.matches();
        System.out.println(b2);
        boolean b3 = matcher1.matches();
        System.out.println(b3);
    }
}