package oop.tasks.string12;

public class PalindromeFinderTests {
    public static void main(String[] args) {
        testPalindromeFinderVer1NormalString();
        testPalindromeFinderVer1EmptyString();
        testPalindromeFinderVer1OneWord();
        testPalindromeFinderVer1NoNumbers();
        testPalindromeFinderVer1OneNumber();

        testPalindromeFinderVer2NormalString();
        testPalindromeFinderVer2EmptyString();
        testPalindromeFinderVer2OneWord();
        testPalindromeFinderVer2NoNumbers();
        testPalindromeFinderVer2OneNumber();
    }

    public static void testPalindromeFinderVer1NormalString() {
        PalindromeFinder pf1 = new PalindromeFinder("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312");
        assert pf1.palindromeFinderVer1().equals("111\n" +
                "121\n" +
                "4554\n" +
                "21312\n");
    }

    public static void testPalindromeFinderVer1NoNumbers() {
        PalindromeFinder pf1 = new PalindromeFinder("If there are dz 'tails', start with first not passed assignment.");
        assert pf1.palindromeFinderVer1().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderVer1EmptyString() {
        PalindromeFinder pf1 = new PalindromeFinder("");
        assert pf1.palindromeFinderVer1().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderVer1OneWord() {
        PalindromeFinder pf1 = new PalindromeFinder("This");
        assert pf1.palindromeFinderVer1().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderVer1OneNumber() {
        PalindromeFinder pf1 = new PalindromeFinder("123");
        assert pf1.palindromeFinderVer1().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderVer2NormalString() {
        PalindromeFinder pf1 = new PalindromeFinder("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312");
        assert pf1.palindromeFinderVer1().equals("111\n" +
                "121\n" +
                "4554\n" +
                "21312\n");
    }

    public static void testPalindromeFinderVer2NoNumbers() {
        PalindromeFinder pf1 = new PalindromeFinder("If there are dz 'tails', start with first not passed assignment.");
        assert pf1.palindromeFinderVer1().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderVer2EmptyString() {
        PalindromeFinder pf1 = new PalindromeFinder("");
        assert pf1.palindromeFinderVer1().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderVer2OneWord() {
        PalindromeFinder pf1 = new PalindromeFinder("This");
        assert pf1.palindromeFinderVer1().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderVer2OneNumber() {
        PalindromeFinder pf1 = new PalindromeFinder("123");
        assert pf1.palindromeFinderVer1().equals("This String is empty or does not contain digital palindromes");
    }

}
