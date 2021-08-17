package oop.tasks.string12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Finder {

    String EMPTY_STRING = "This string is empty or consists of words with less than two chars";

    Pattern getSearchPattern();

    default String findWords(String parsedString) {

        Pattern pattern = this.getSearchPattern();
        Matcher matcher = pattern.matcher(parsedString);
        boolean hasWords = matcher.find();

        if (!hasWords) {
            return EMPTY_STRING;
        }

        String result = matcher.group() + "\n";

        while (matcher.find()) {
            String foundWord = matcher.group();
            result = result.concat(foundWord + "\n");
        }
        return result;
    }

    default String [] transformingStringIntoWords(String parsedString) {
        return this.findWords(parsedString).split("\n");
    }
}
