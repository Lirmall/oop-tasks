package oop.tasks.collections4;

public class RepetitionRemoverTests {
    public static void main(String[] args) {
        testRepeatAtStart();
        testRepeatAtMiddle();
        testRepeatAtEnd();
        testEmptyString();
        testOneChar();
        testOneWord();
    }

    public static void testRepeatAtStart() {
        RepetitionRemover string = new RepetitionRemover("1, 1, 2, 3, 4, 5");
        assert string.repetitionRemover().equals("1, 2, 3, 4, 5");
    }

    public static void testRepeatAtMiddle() {
        RepetitionRemover string = new RepetitionRemover("1, 2, 3, 3, 4, 5");
        assert string.repetitionRemover().equals("1, 2, 3, 4, 5");
    }

    public static void testRepeatAtEnd() {
        RepetitionRemover string = new RepetitionRemover("1, 2, 3, 3, 4, 5, 5");
        assert string.repetitionRemover().equals("1, 2, 3, 4, 5");
    }

    public static void testEmptyString() {
        RepetitionRemover string = new RepetitionRemover("");
        assert string.repetitionRemover().equals("");
    }

    public static void testOneChar() {
        RepetitionRemover string = new RepetitionRemover("1");
        assert string.repetitionRemover().equals("1");
    }

    public static void testOneWord() {
        RepetitionRemover string = new RepetitionRemover("123345");
        assert string.repetitionRemover().equals("123345");
    }

}
