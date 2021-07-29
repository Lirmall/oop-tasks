package oop.tasks.string12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalindromeFinderUsingStringMethods extends PalindromeFinder {


    public PalindromeFinderUsingStringMethods(String string) {
        super(string);
    }

    @Override
    public String palindromeFind() {
        Pattern pattern = Pattern.compile("[0-9]{2,}");
        Matcher matcher = pattern.matcher(this.getString());
        if (!matcher.find()) {
            return "This String is empty or does not contain digital palindromes";
        }

        String result = "";
        while (matcher.find()) {
            String subStr = matcher.group();
            StringBuilder sb = new StringBuilder(subStr);
            StringBuilder revSubStr = new StringBuilder(sb.reverse());
            String sbRev = new String(revSubStr);

            if (subStr.equals(sbRev)) {
                result = result.concat(subStr + "\n");
            }
        }
        if (result.equals("")) {
            result = "This String is empty or does not contain digital palindromes";
        }
        return result;
    }
}

