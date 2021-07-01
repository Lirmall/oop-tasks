package oop.tasks.string12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalindromeFinder {

    public static void main(String[] args) {
        String str = "If there are dz 'tails', start with 1 not passed assignment. 123 324 111 4554 ";
        Pattern pattern = Pattern.compile("[1-9]{2,}");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            String subStr = matcher.group();
            StringBuilder sb = new StringBuilder(subStr);
            StringBuilder revSubStr = new StringBuilder(sb.reverse());
            String sbRev = new String(revSubStr);

            if (subStr.equals(sbRev)) {
                System.out.println(matcher.group());
            }
        }
    }
}