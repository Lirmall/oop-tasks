package oop.tasks.string10;

import java.util.*;

public class StringWordsFinder extends WordsFinder{
    String string;

    public StringWordsFinder(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public String wordFinderWithLeastNumberOfDifferentChars() {
        Map<String, Integer> lhm = new LinkedHashMap<>();
        String[] arrayOfTextWords = this.getString().split("\\s");
        String key = null;
        for (String word : arrayOfTextWords) {
            lhm.put(word, this.wordsScanner(word).length());
        }

        List<Integer> listOfNumbersOfDifferentChars = new ArrayList<>(lhm.values());
        int[] values = new int[listOfNumbersOfDifferentChars.size()];

        for (int i = 0; i < values.length; i++) {
            values[i] = listOfNumbersOfDifferentChars.get(i);
        }

        Set<Map.Entry<String, Integer>> entrySet = lhm.entrySet();
        for (Map.Entry<String, Integer> pair : entrySet) {
            if (this.minValueFinder(values) == pair.getValue()) {
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
        int minValue = ints[0];
        for (int i : ints) {
            if (minValue > i) {
                minValue = i;
            }
        }
        return minValue;
    }
}
