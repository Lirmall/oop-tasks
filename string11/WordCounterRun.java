package oop.tasks.string11;

public class WordCounterRun {
    public static void main(String[] args) {
        WordCounter wc1 = new WordCounter("One two three раз два три one1 two2 123 ");

        System.out.println(wc1.wordCounterVer1());
        System.out.println(wc1.wordCounterVer2());
    }
}
