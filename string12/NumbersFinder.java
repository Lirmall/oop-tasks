package oop.tasks.string12;

import java.util.regex.Pattern;

public class NumbersFinder implements Finder {

    private final Pattern searchPattern = Pattern.compile("[0-9]{2,}");

    public NumbersFinder() {
    }

    public Pattern getSearchPattern() {
        return this.searchPattern;
    }
}
