package oop.tasks.string11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {
    private final String str;

    public WordCounter(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public int wordCounterVer1() {
        int result = 0;
        Pattern pattern = Pattern.compile("[a-z]+\\s", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(this.getStr());

        while (matcher.find()) {
            result++;
        }
        return result;
    }

    public int wordCounterVer2() {
        int result = 0;
        Pattern pattern = Pattern.compile("[A-Za-z]+\\s");
        Matcher matcher = pattern.matcher(this.getStr());

        while (matcher.find()) {
            result++;
        }

        return result;
    }
}
