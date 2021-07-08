package oop.tasks.string12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalindromeFinder {
    String string;

    public PalindromeFinder(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }

    public String palindromeFinderVer1() {
        String result = "";
        Pattern pattern = Pattern.compile("[0-9]{2,}");
        Matcher matcher = pattern.matcher(this.getString());
        if (!matcher.find()){
            result = "This String is empty or does not contain digital palindromes";
        }

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

    public String palindromeFinderVer2() {
        String result = "";
        Pattern pattern = Pattern.compile("[0-9]{2,}");
        Matcher matcher = pattern.matcher(this.getString());
        if (!matcher.find()){
            result = "This String is empty or does not contain digital palindromes";
        }

        while (matcher.find()) {
            int i = 0;
            int j = matcher.group().length() - 1;

            if (matcher.group().length() % 2 == 0) {
                while (i <= matcher.group().length() / 2 - 1)
                    if (matcher.group().charAt(i) == matcher.group().charAt(j)) {
                        i++;
                        j--;

                        if (i + 1 == j) {
                            result = result.concat(matcher.group() + "\n");
                        }
                    } else {
                        break;
                    }


            }

            if (matcher.group().length() % 2 == 1) {
                while (i <= matcher.group().length() / 2)
                    if (matcher.group().charAt(i) == matcher.group().charAt(j)) {
                        i++;
                        j--;

                        if (i == j) {
                            result = result.concat(matcher.group() + "\n");
                        }
                    } else {
                        break;
                    }
            }
        }
        if (result.equals("")) {
            result = "This String is empty or does not contain digital palindromes";
        }
        return result;
    }
}

