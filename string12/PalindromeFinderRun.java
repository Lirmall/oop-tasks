package oop.tasks.string12;

public class PalindromeFinderRun {
    public static void main(String[] args) {
        PalindromeFinder palindromeUseStringMethods = new PalindromeFinderUsingStringMethods("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312");
        PalindromeFinder palindromeFinderByChars = new PalindromeFinderByChars("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312");
        PalindromeFinder palindromeFinderUseFor = new PalindromeFinderUseFor("If there are dz 'tails', start with 1 not passed assignment. 123 324 111 121 4554 21312");

        System.out.println(palindromeUseStringMethods.scanningTextToFindPalindromes());
        System.out.println();

        System.out.println(palindromeFinderByChars.scanningTextToFindPalindromes());
        System.out.println();

        System.out.println(palindromeFinderUseFor.scanningTextToFindPalindromes());
        System.out.println();

    }
}
