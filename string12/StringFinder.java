package oop.tasks.string12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFinder implements Finder{

    private static final String EMPTY_STRING = "This string is empty or consists of words with less than two chars";

    public StringFinder() {
    }

    public String findWords(String parsedString) {

        Pattern pattern = Pattern.compile("[A-Za-z]{2,}");
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

    public String [] transformingTheListOfFoundWordsIntoAnArray (String parsedString) {
        return this.findWords(parsedString).split("\n");
    }
}
