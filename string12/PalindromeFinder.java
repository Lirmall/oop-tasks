package oop.tasks.string12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PalindromeFinder {
    private String string;

    public PalindromeFinder(String string) {
        this.string = string;
    }

    public String getString() {
        return this.string;
    }

    public String scanningTextToFindPalindromes() {
        Pattern pattern = Pattern.compile("[0-9]{2,}");
        Matcher matcher = pattern.matcher(this.getString());

        if (!matcher.find()) {
            return "This String is empty or does not contain digital palindromes";
        }
        String result = "";
        while (matcher.find()) {
            String foundWord = matcher.group();
            result = result.concat(this.findPalindrome(foundWord));
        }

        if (result.equals("")) {
            result = "This String is empty or does not contain digital palindromes";
        }

        return result;
    }

    public abstract String findPalindrome(String oneWord);
}

