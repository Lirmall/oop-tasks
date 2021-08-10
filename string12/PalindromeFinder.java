package oop.tasks.string12;

public abstract class PalindromeFinder<NeededFinder extends Finder> {
    private static final String EMPTY_STRING = "This String is empty or does not contain palindromes";
    private final String string;
    private final NeededFinder neededFinder;

    public PalindromeFinder(String string, NeededFinder neededFinder) {
        this.string = string;
        this.neededFinder = neededFinder;
    }

    public String getString() {
        return this.string;
    }

    public String scanningTextToFindPalindromes() {
        String result = "";
        String[] foundWords = this.neededFinder.transformingTheListOfFoundWordsIntoAnArray(this.getString());

        for (String oneWordFromArray : foundWords) {
            result = result.concat(this.findPalindrome(oneWordFromArray));
        }

        return result.equals("") ? EMPTY_STRING : result;
    }

    protected abstract String findPalindrome(String oneWord);
}

