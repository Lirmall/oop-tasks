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

    public static void testSeveralLettersRepeating() {
        StringWordsFinder str = new StringWordsFinder("fffff aa hhhhhhhhhh llllll tttttttt ff");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("fffff");
    }

    public static void testSingleChar () {
        StringWordsFinder str = new StringWordsFinder("f");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("f");
    }

    public static void testMinimalInTheBeginning() {
        StringWordsFinder str = new StringWordsFinder("sdffff ff dsdasd dsasd ddddddd dffff s");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("ff");
    }

    public static void testSeveralSingleChars() {
        StringWordsFinder str = new StringWordsFinder("f a w g j v");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("f");
    }

    public static void testSeveralMultiChars() {
        StringWordsFinder str = new StringWordsFinder("hdjf dhfg");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("hdjf");
    }

    public static void testMinimalInTheEnd() {
        StringWordsFinder str = new StringWordsFinder("dddddsssssss ds");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("dddddsssssss");
    }

    public static void testMinimalSame() {
        StringWordsFinder str = new StringWordsFinder("ss ssssssssss");
        String result = str.wordFinderWithLeastNumberOfDifferentChars();
        assert result.equals("ss");
    }
}
