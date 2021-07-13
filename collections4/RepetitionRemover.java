package oop.tasks.collections4;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class RepetitionRemover {
    private final String string;

    public RepetitionRemover(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public String repetitionRemover() {
        String result;
        String [] arrayOfWords = this.getString().split("\\s");

        Set<String> setOfWords = new TreeSet<>();

        Collections.addAll(setOfWords, arrayOfWords);

        result = setOfWords.toString();
        return result;
    }
}
