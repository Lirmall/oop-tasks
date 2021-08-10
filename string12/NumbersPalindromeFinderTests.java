package oop.tasks.string12;

public class NumbersPalindromeFinderTests {
    public static void main(String[] args) {
        testPalindromeFinderByCharsNormalString();
        testPalindromeFinderByCharsEmptyString();
        testPalindromeFinderByCharsOneWord();
        testPalindromeFinderByCharsNoNumbers();
        testPalindromeFinderByCharsOneNumber();
        testPalindromeFinderByCharsOnePalindromeNumber();

        testPalindromeFinderUsingStringMethodsNormalString();
        testPalindromeFinderUsingStringMethodsEmptyString();
        testPalindromeFinderUsingStringMethodsOneWord();
        testPalindromeFinderUsingStringMethodsNoNumbers();
        testPalindromeFinderUsingStringMethodsOneNumber();
        testPalindromeFinderUsingStringMethodsOnePalindromeNumber();

        testPalindromeFinderUseForNormalString();
        testPalindromeFinderUseForEmptyString();
        testPalindromeFinderUseForOneWord();
        testPalindromeFinderUseForNoNumbers();
        testPalindromeFinderUseForOneNumber();
        testPalindromeFinderUseForOnePalindromeNumber();
    }

    public static void testPalindromeFinderByCharsNormalString() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderByChars("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("111\n" +
                "121\n" +
                "4554\n" +
                "21312\n");
    }

    public static void testPalindromeFinderByCharsNoNumbers() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderByChars("If there are dz 'tails', start with 1 not passed assignment.", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderByCharsEmptyString() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderByChars("", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderByCharsOneWord() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderByChars("This", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderByCharsOneNumber() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderByChars("123", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderByCharsOnePalindromeNumber() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderByChars("121", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("121\n");
    }



    public static void testPalindromeFinderUsingStringMethodsNormalString() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("111\n" +
                "121\n" +
                "4554\n" +
                "21312\n");
    }

    public static void testPalindromeFinderUsingStringMethodsNoNumbers() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("If there are dz 'tails', start with first not passed assignment.", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsEmptyString() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsOneWord() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("This", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsOneNumber() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("123", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsOnePalindromeNumber() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("121", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("121\n");
    }




    public static void testPalindromeFinderUseForNormalString() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUseFor("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("111\n" +
                "121\n" +
                "4554\n" +
                "21312\n");
    }

    public static void testPalindromeFinderUseForNoNumbers() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUseFor("If there are dz 'tails', start with first not passed assignment.", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUseForEmptyString() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUseFor("", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUseForOneWord() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUseFor("This", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUseForOneNumber() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUseFor("123", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUseForOnePalindromeNumber() {
        NumbersFinder numbersFinder = new NumbersFinder();
        PalindromeFinder pf1 = new PalindromeFinderUsingStringMethods("121", numbersFinder);
        assert pf1.scanningTextToFindPalindromes().equals("121\n");
    }

}
