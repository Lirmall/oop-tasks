package oop.tasks.string10;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetWordsFinder extends WordsFinder {
    String string;

    public SetWordsFinder(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public String wordFinderWithLeastNumberOfDifferentChars() {
        int i = 0;
        int l = 0;
        String result;
        Set<Character> lhs = new LinkedHashSet<>();
        String[] arrayOfTextWords = this.getString().split("\\s");
        int[] arrayOfNumbersOfDifferentChars = new int[arrayOfTextWords.length];

        for (String str : arrayOfTextWords) {
            char[] differentCharsOfWord = str.toCharArray();
            for (char ch : differentCharsOfWord) {
                lhs.add(ch);
            }
            arrayOfNumbersOfDifferentChars[l] = lhs.size();
            if (l < arrayOfTextWords.length - 1) {
                l++;
            }
            lhs.clear();
        }

        for (int k : arrayOfNumbersOfDifferentChars) {
            if (k != minValueFinder(arrayOfNumbersOfDifferentChars)) {
                i++;
            } else {
                break;
            }
        }
        result = arrayOfTextWords[i];
        System.out.println("First word with least use of different characters: " + result);
        System.out.println("Number of different characters in a word: " + minValueFinder(arrayOfNumbersOfDifferentChars));
        System.out.println();
        return result;
    }

    public int minValueFinder(int[] ints) {
        int minValue = ints[0];
        for (int i : ints) {
            if (minValue > i) {
                minValue = i;
            }
        }
        return minValue;
    }
}
