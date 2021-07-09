package oop.tasks.string10;

public class WordsFinderTests {
    public static void main(String[] args) {
        testSingleLetter();
        testSingleLetterRepeating();
        testEmptyString();
        testSeveralLetters();

        testStringWordsFinderSeveralLettersRepeating();
        testStringWordsFinderSingleChar();
        testStringWordsFinderMinimalInTheBeginning();
        testStringWordsFinderSeveralSingleChars();
        testStringWordsFinderSeveralMultiChars();
        testStringWordsFinderMinimalInTheEnd();
        testStringWordsFinderMinimalSame();

        testSetWordsFinderSeveralLettersRepeating();
        testSetWordsFinderSingleChar();
        testSetWordsFinderMinimalInTheBeginning();
        testSetWordsFinderSeveralSingleChars();
        testSetWordsFinderSeveralMultiChars();
        testSetWordsFinderMinimalInTheEnd();
        testSetWordsFinderMinimalSame();

    }

    public static void testSingleLetter() {
        StringWordsFinder result = new StringWordsFinder("ssssssssss");
        String s = result.wordsScanner("ssssssssss");
        assert s.equals("s");
    }

    public static void testSingleLetterRepeating() {
        StringWordsFinder result = new StringWordsFinder("dsdasd");
        String s = result.wordsScanner("dsdasd");
        assert s.equals("dsa");
    }

    public static void testEmptyString() {
        StringWordsFinder result = new StringWordsFinder("");
        String s = result.wordsScanner("");
        assert s.equals("");
    }

    public static void testSeveralLetters() {
        StringWordsFinder result = new StringWordsFinder("dddddsssssss");
        String s = result.wordsScanner("dddddsssssss");
        assert s.equals("ds");
    }

    public static void testStringWordsFinderSeveralLettersRepeating() {
        StringWordsFinder str = new StringWordsFinder("fffff aa hhhhhhhhhh llllll tttttttt ff");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("fffff");
    }

    public static void testStringWordsFinderSingleChar() {
        StringWordsFinder str = new StringWordsFinder("f");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("f");
    }

    public static void testStringWordsFinderMinimalInTheBeginning() {
        StringWordsFinder str = new StringWordsFinder("sdffff ff dsdasd dsasd ddddddd dffff s");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("ff");
    }

    public static void testStringWordsFinderSeveralSingleChars() {
        StringWordsFinder str = new StringWordsFinder("f a w g j v");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("f");
    }

    public static void testStringWordsFinderSeveralMultiChars() {
        StringWordsFinder str = new StringWordsFinder("hdjf dhfg");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("hdjf");
    }

    public static void testStringWordsFinderMinimalInTheEnd() {
        StringWordsFinder str = new StringWordsFinder("dddddsssssss ds");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("dddddsssssss");
    }

    public static void testStringWordsFinderMinimalSame() {
        StringWordsFinder str = new StringWordsFinder("ss ssssssssss");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("ss");
    }

    public static void testSetWordsFinderSeveralLettersRepeating() {
        SetWordsFinder str = new SetWordsFinder("fffff aa hhhhhhhhhh llllll tttttttt ff");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("fffff");
    }

    public static void testSetWordsFinderSingleChar() {
        SetWordsFinder str = new SetWordsFinder("f");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("f");
    }

    public static void testSetWordsFinderMinimalInTheBeginning() {
        SetWordsFinder str = new SetWordsFinder("sdffff ff dsdasd dsasd ddddddd dffff s");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("ff");
    }

    public static void testSetWordsFinderSeveralSingleChars() {
        SetWordsFinder str = new SetWordsFinder("f a w g j v");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("f");
    }

    public static void testSetWordsFinderSeveralMultiChars() {
        SetWordsFinder str = new SetWordsFinder("hdjf dhfg");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("hdjf");
    }

    public static void testSetWordsFinderMinimalInTheEnd() {
        SetWordsFinder str = new SetWordsFinder("dddddsssssss ds");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("dddddsssssss");
    }

    public static void testSetWordsFinderMinimalSame() {
        SetWordsFinder str = new SetWordsFinder("ss ssssssssss");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("ss");
    }
}
