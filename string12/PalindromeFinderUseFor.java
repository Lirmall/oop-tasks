package oop.tasks.string12;

public class PalindromeFinderUseFor extends PalindromeFinder {

    public PalindromeFinderUseFor(String string, Finder finder) {
        super(string, finder);
    }

    @Override
    public String findPalindrome(String oneWord) {
        String result = "";

        for (int k = 0, i = oneWord.length(), j = i - 1; k < i / 2; k++) {
            if (oneWord.charAt(k) == oneWord.charAt(j)) {
                j--;
                if (k + 1 == j || k == j) {
                    result = result.concat(oneWord + "\n");
                }
            } else {
                break;
            }
        }
        return result;
    }
}
