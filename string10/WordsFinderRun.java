package oop.tasks.string10;

public class WordsFinderRun {
    public static void main(String[] args) {
        StringWordsFinder stringWordsFinder = new StringWordsFinder("fffff ab f 1234 jkjk dddasssaddddswwwwghhh");
        SetWordsFinder setWordsFinder = new SetWordsFinder("fffff ab f 1234 jkjk dddasssaddddswwwwghhh");

        stringWordsFinder.wordFinderWithLeastNumberOfDifferentChars();
        setWordsFinder.wordFinderWithLeastNumberOfDifferentChars();
    }
}
