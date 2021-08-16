package oop.tasks.string12;

public class StringPalindromeFinderTests {

    public static void main(String[] args) {
        testPalindromeFinderByCharsNormalString();
        testPalindromeFinderByCharsEmptyString();
        testPalindromeFinderByCharsOneWord();
        testPalindromeFinderByCharsNoWordPalindromes();
        testPalindromeFinderByCharsOneNumber();
        testPalindromeFinderByCharsOnePalindromeWord();

        testPalindromeFinderUsingStringMethodsNormalString();
        testPalindromeFinderUsingStringMethodsEmptyString();
        testPalindromeFinderUsingStringMethodsOneWord();
        testPalindromeFinderUsingStringMethodsNoPalindromes();
        testPalindromeFinderUsingStringMethodsOneNumber();
        testPalindromeFinderUsingStringMethodsOnePalindromeWord();

        testPalindromeFinderUseForNormalString();
        testPalindromeFinderUseForEmptyString();
        testPalindromeFinderUseForOneWord();
        testPalindromeFinderUseForNoPalindromes();
        testPalindromeFinderUseForOneNumber();
        testPalindromeFinderUseForOnePalindromeWord();
    }

    public static void testPalindromeFinderByCharsNormalString() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderByChars<>("bob bib lulz tail chest madam", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("bob\nbib\nmadam\n");
    }


    public static void testPalindromeFinderByCharsNoWordPalindromes() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderByChars<>("If there are dz 'tails', start with 1 not passed assignment.", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderByCharsEmptyString() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderByChars<>("", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderByCharsOneWord() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderByChars<>("This", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderByCharsOneNumber() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderByChars<>("123", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderByCharsOnePalindromeWord() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderByChars<>("did", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("did\n");
    }


    public static void testPalindromeFinderUsingStringMethodsNormalString() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUsingStringMethods<>("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsNoPalindromes() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUsingStringMethods<>("If there are dz 'tails', start with first not passed assignment.", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsEmptyString() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUsingStringMethods<>("", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsOneWord() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUsingStringMethods<>("This", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsOneNumber() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUsingStringMethods<>("123", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUsingStringMethodsOnePalindromeWord() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUsingStringMethods<>("did", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("did\n");
    }


    public static void testPalindromeFinderUseForNormalString() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUseFor<>("bob bib lulz tail chest madam", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("bob\n" +
                "bib\n" +
                "madam\n");
    }

    public static void testPalindromeFinderUseForNoPalindromes() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUseFor<>("If there are dz 'tails', start with first not passed assignment.", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUseForEmptyString() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUseFor<>("", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUseForOneWord() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUseFor<>("This", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUseForOneNumber() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUseFor<>("123", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("This String is empty or does not contain palindromes");
    }

    public static void testPalindromeFinderUseForOnePalindromeWord() {
        StringFinder stringFinder = new StringFinder();
        PalindromeFinder<StringFinder> pf1 = new PalindromeFinderUsingStringMethods<>("did", stringFinder);
        assert pf1.scanningTextToFindPalindromes().equals("did\n");
    }

}


