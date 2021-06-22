package oop.tasks.string3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplacement {
    private final String string;

    public StringReplacement(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public String replacement1(String string1, String string2) {

        int i = 0;
        StringBuilder str = new StringBuilder(this.getString());
        String result;

        Pattern pat = Pattern.compile(string1);
        Matcher mat = pat.matcher(str);

        do {
            mat.find(i);
            mat.find();
            str.replace(mat.start(), mat.end(), string2);
            i = mat.start();
        } while (mat.find());

        result = new String(str);
        return result;
    }
}
