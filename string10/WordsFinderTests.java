package oop.tasks.string10;

public class WordsFinderTests {
    public static void main(String[] args) {
        testSingleLetter();
        testSingleLetterRepeating();
        testEmptyString();
        testSeveralLetters();
        testSeveralLettersRepeating();
        testSingleChar();
        testMinimalInTheBeginning();
        testSeveralSingleChars();
        testSeveralMultiChars();
        testMinimalInTheEnd();
        testMinimalSame();
    }

    public static void testSingleLetter() {
        WordsFinder wordsFinder = new WordsFinder("ssssssssss");
        String s = wordsFinder.wordsScanner("ssssssssss");
        assert s.equals("s");
    }

    public static void testSingleLetterRepeating() {
        WordsFinder wordsFinder = new WordsFinder("dsdasd");
        String s = wordsFinder.wordsScanner("dsdasd");
        assert s.equals("dsa");
    }

    public static void testEmptyString() {
        WordsFinder wordsFinder = new WordsFinder("");
        String s = wordsFinder.wordsScanner("");
        assert s.equals("");
    }

    public static void testSeveralLetters() {
        WordsFinder wordsFinder = new WordsFinder("dddddsssssss");
        String s = wordsFinder.wordsScanner("dddddsssssss");
        assert s.equals("ds");
    }

    public static void testSeveralLettersRepeating() {
        WordsFinder str = new WordsFinder("fffff aa hhhhhhhhhh llllll tttttttt ff");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("fffff");
    }

    public static void testSingleChar () {
        WordsFinder str = new WordsFinder("f");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("f");
    }

    public static void testMinimalInTheBeginning() {
        WordsFinder str = new WordsFinder("sdffff ff dsdasd dsasd ddddddd dffff s");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("ff");
    }

    public static void testSeveralSingleChars() {
        WordsFinder str = new WordsFinder("f a w g j v");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("f");
    }

    public static void testSeveralMultiChars() {
        WordsFinder str = new WordsFinder("hdjf dhfg");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("hdjf");
    }

    public static void testMinimalInTheEnd() {
        WordsFinder str = new WordsFinder("dddddsssssss ds");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("dddddsssssss");
    }

    public static void testMinimalSame() {
        WordsFinder str = new WordsFinder("ss ssssssssss");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("ss");
    }
}
