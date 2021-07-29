package oop.tasks.string12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalindromeFinderUseFor extends PalindromeFinder{


    public PalindromeFinderUseFor(String string) {
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
            int m = word.length();
            int j = m - 1;

            for (int k = 0; k < m / 2; k++) {
                if (word.charAt(k) == word.charAt(j)) {
                    j--;
                    if (k + 1 == j || k == j) {
                        result = result.concat(matcher.group() + "\n");
                    }
                } else {
                    break;
                }

            }
        }

        if (result.equals("")) {
            return "This String is empty or does not contain digital palindromes";
        }
        return result;
    }
}
