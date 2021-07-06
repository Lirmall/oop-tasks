package oop.tasks.string10;

import java.util.*;

public class WordsFinder {
    String string;

    public WordsFinder(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public String wordFinderWithLeastNumberOfDifferentChars() {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        String[] arrayOfTextWords = this.getString().split("\\s");
        String key = null;
        for (String word : arrayOfTextWords) {
            lhm.put(word, this.wordsScanner(word).length());
        }

        ArrayList<Integer> valuesList = new ArrayList<>(lhm.values());
        int[] vals = new int[valuesList.size()];

        for (int i = 0; i < vals.length; i++) {
            vals[i] = valuesList.get(i);
        }

        Set<Map.Entry<String, Integer>> entrySet = lhm.entrySet();
        for (Map.Entry<String, Integer> pair : entrySet) {
            if (this.minValueFinder(vals) == pair.getValue()) {
                System.out.println("First word with least use of different characters: " + pair.getKey());
                System.out.println("Number of different characters in a word: " + pair.getValue());
                System.out.println();
                key = pair.getKey();
                break;
            }
        }

        return key;
    }

    public String wordsScanner(String string) {
        int i = 0;
        StringBuilder strB = new StringBuilder(string);
        int j = strB.length() - 1;

        while (i <= strB.length() - 1) {
            char ch = strB.charAt(i);
            if (i == strB.length() - 1) {
                break;
            }
            if (ch == strB.charAt(j)) {
                strB.deleteCharAt(j);
                j = strB.length() - 1;
            } else {

                if (j > i + 1) {
                    j--;
                } else {
                    i++;
                    j = strB.length() - 1;
                }
            }

        }
        return strB.toString();
    }

    public int minValueFinder(int[] ints) {
        int maxValue = 0;
        for (int j : ints) {
            if (maxValue < j) {
                maxValue = j;
            }
        }
        int minValue = maxValue;
        for (int y : ints) {
            if (minValue > y) {
                minValue = y;
            }
        }
        return minValue;
    }
}
