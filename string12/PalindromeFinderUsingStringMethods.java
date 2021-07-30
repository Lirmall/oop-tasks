package oop.tasks.string12;

public class PalindromeFinderUsingStringMethods extends PalindromeFinder {

    public PalindromeFinderUsingStringMethods(String string) {
        super(string);
    }

    @Override
    public String findPalindrome(String oneWord) {
        String result = "";

        StringBuilder sb = new StringBuilder(oneWord);
        StringBuilder revSubStr = new StringBuilder(sb.reverse());
        String sbRev = new String(revSubStr);

        if (oneWord.equals(sbRev)) {
            result = result.concat(oneWord + "\n");
        }
        return result;
    }
}

