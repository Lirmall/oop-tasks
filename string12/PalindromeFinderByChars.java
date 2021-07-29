package oop.tasks.string12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalindromeFinderByChars extends PalindromeFinder {


    public PalindromeFinderByChars(String string) {
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
            String word = matcher.group();
            int i = 0;
            int j = word.length() - 1;

            if (word.length() % 2 == 0) {
                while (i <= word.length() / 2 - 1) {
                    if (word.charAt(i) == word.charAt(j)) {
                        i++;
                        j--;

                        if (i + 1 == j) {
                            result = result.concat(word + "\n");
                        }
                    } else {
                        break;
                    }

                }
            }

            if (word.length() % 2 == 1) {
                while (i <= word.length() / 2) {
                    if (word.charAt(i) == word.charAt(j)) {
                        i++;
                        j--;

                        if (i == j) {
                            result = result.concat(word + "\n");
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        if (result.equals("")) {
            result = "This String is empty or does not contain digital palindromes";
        }
        return result;
    }


}

