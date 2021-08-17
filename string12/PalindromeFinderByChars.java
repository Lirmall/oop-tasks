package oop.tasks.string12;

public class PalindromeFinderByChars<NeededFinder extends Finder> extends PalindromeFinder<NeededFinder> {

    public PalindromeFinderByChars(String string, Finder finder) {
        super(string, (NeededFinder) finder);
    }

    @Override
    public String findPalindrome(String oneWord) {
        String result = "";

        int i = 0;
        int j = oneWord.length() - 1;

        if (oneWord.length() % 2 == 0) {
            while (i <= oneWord.length() / 2 - 1) {
                if (oneWord.charAt(i) == oneWord.charAt(j)) {
                    i++;
                    j--;

                    if (i + 1 == j) {
                        result = result.concat(oneWord + "\n");
                    }
                } else {
                    break;
                }
            }
        }

        if (oneWord.length() % 2 == 1) {
            while (i <= oneWord.length() / 2) {
                if (oneWord.charAt(i) == oneWord.charAt(j)) {
                    i++;
                    j--;

                    if (i == j) {
                        result = result.concat(oneWord + "\n");
                    }
                } else {
                    break;
                }
            }
        }
        return result;
    }
}
