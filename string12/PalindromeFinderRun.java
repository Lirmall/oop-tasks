package oop.tasks.string12;

public class PalindromeFinderRun {
    public static void main(String[] args) {
        NumbersFinder numbersFinder = new NumbersFinder();
        StringFinder stringFinder = new StringFinder();

        PalindromeFinder<NumbersFinder> numberPalindromeFinderUseStringMethods = new PalindromeFinderUsingStringMethods<>(
                "If there are dz 'tails', start with 1 not passed assignment. 555 123 324 111 121 4554 21312", numbersFinder);

        PalindromeFinder<NumbersFinder> numberPalindromeFinderByChars = new PalindromeFinderByChars<>(
                "If there are dz 'tails', start with 1 not passed assignment. 555 123 324 111 121 4554 21312", numbersFinder);

        PalindromeFinder<NumbersFinder> numberPalindromeFinderUseFor = new PalindromeFinderUseFor<>(
                "If there are dz 'tails', start with 1 not passed assignment. 555 123 324 111 121 4554 21312", numbersFinder);

        PalindromeFinder<StringFinder> stringPalindromeUseStringMethods = new PalindromeFinderUsingStringMethods<>(
                "bob bib madam lulz tail chest", stringFinder);

        PalindromeFinder<StringFinder> stringPalindromeFinderByChars = new PalindromeFinderByChars<>(
                "bob bib madam lulz tail chest", stringFinder);

        PalindromeFinder<StringFinder> stringPalindromeFinderUseFor = new PalindromeFinderUseFor<>(
                "bob bib madam lulz tail chest", stringFinder);

        System.out.println("Number palindromes:");
        System.out.println(numberPalindromeFinderUseStringMethods.scanningTextToFindPalindromes());
        System.out.println();

        System.out.println(numberPalindromeFinderByChars.scanningTextToFindPalindromes());
        System.out.println();

        System.out.println(numberPalindromeFinderUseFor.scanningTextToFindPalindromes());
        System.out.println();

        System.out.println("String palindromes:");
        System.out.print(stringPalindromeUseStringMethods.scanningTextToFindPalindromes());
        System.out.println();

        System.out.println(stringPalindromeFinderByChars.scanningTextToFindPalindromes());
        System.out.println();

        System.out.println(stringPalindromeFinderUseFor.scanningTextToFindPalindromes());
        System.out.println();
    }
}
