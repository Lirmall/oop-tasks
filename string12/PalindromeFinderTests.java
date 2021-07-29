package oop.tasks.string12;

public class PalindromeFinderTests {
    public static void main(String[] args) {
        testPalindromeFinderByCharsNormalString();
        testPalindromeFinderVer1EmptyString();
        testPalindromeFinderVer1OneWord();
        testPalindromeFinderByCharsNoNumbers();
        testPalindromeFinderByCharsOneNumber();

        testPalindromeFinderUsingStringMethodsNormalString();
        testPalindromeFinderUsingStringMethodsEmptyString();
        testPalindromeFinderUsingStringMethodsOneWord();
        testPalindromeFinderUsingStringMethodsNoNumbers();
        testPalindromeFinderUsingStringMethodsOneNumber();

        testPalindromeFinderUseForNormalString();
        testPalindromeFinderUseForEmptyString();
        testPalindromeFinderUseForOneWord();
        testPalindromeFinderUseForNoNumbers();
        testPalindromeFinderUseForOneNumber();
    }

    public static void testPalindromeFinderByCharsNormalString() {
        PalindromeFinder pf1 = new PalindromeFinderByChars("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312");
        assert pf1.palindromeFind().equals("111\n" +
                "121\n" +
                "4554\n" +
                "21312\n");
    }

    public static void testPalindromeFinderByCharsNoNumbers() {
        PalindromeFinder pf1 = new PalindromeFinderByChars("If there are dz 'tails', start with first not passed assignment.");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderVer1EmptyString() {
        PalindromeFinder pf1 = new PalindromeFinderByChars("");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderVer1OneWord() {
        PalindromeFinder pf1 = new PalindromeFinderByChars("This");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderByCharsOneNumber() {
        PalindromeFinder pf1 = new PalindromeFinderByChars("123");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsNormalString() {
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312");
        assert pf1.palindromeFind().equals("111\n" +
                "121\n" +
                "4554\n" +
                "21312\n");
    }

    public static void testPalindromeFinderUsingStringMethodsNoNumbers() {
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("If there are dz 'tails', start with first not passed assignment.");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsEmptyString() {
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsOneWord() {
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("This");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsOneNumber() {
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("123");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderUseForNormalString() {
        PalindromeFinder pf1 = new PalindromeFinderUseFor("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312");
        assert pf1.palindromeFind().equals("111\n" +
                "121\n" +
                "4554\n" +
                "21312\n");
    }

    public static void testPalindromeFinderUseForNoNumbers() {
        PalindromeFinder pf1 = new PalindromeFinderUseFor("If there are dz 'tails', start with first not passed assignment.");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderUseForEmptyString() {
        PalindromeFinder pf1 = new PalindromeFinderUseFor("");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderUseForOneWord() {
        PalindromeFinder pf1 = new PalindromeFinderUseFor("This");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

    public static void testPalindromeFinderUseForOneNumber() {
        PalindromeFinder pf1 = new PalindromeFinderUseFor("123");
        assert pf1.palindromeFind().equals("This String is empty or does not contain digital palindromes");
    }

}
