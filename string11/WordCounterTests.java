package oop.tasks.string11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounterTests {
    public static void main(String[] args) {
        counterTest();
        testWordCounterVer1();
        testWordCounterVer2();
    }

    static void counterTest() {
        int i = 0;
        String str = "One two three раз два три one1 two2 123 ";
        Pattern pattern = Pattern.compile("[a-z]+\\s", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            i++;
        }

        assert i == 3;
    }

    static void testWordCounterVer1() {
        WordCounter wc1 = new WordCounter("One two three раз два три one1 two2 123 ");

        assert wc1.wordCounterVer1() == 3;
    }

    static void testWordCounterVer2() {
        WordCounter wc1 = new WordCounter("One two three раз два три one1 two2 123 ");

        assert wc1.wordCounterVer1() == 3;
    }
}
