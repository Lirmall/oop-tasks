package oop.tasks.string12;

import java.util.regex.Pattern;

public class StringFinder implements Finder{

    private final Pattern searchPattern = Pattern.compile("[A-Za-z]{2,}");

    public StringFinder() {
    }

    public Pattern getSearchPattern() {
        return this.searchPattern;
    }

}
