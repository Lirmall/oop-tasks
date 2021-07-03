package oop.tasks.string2;

public class StringBuilding {
    public static void main(String[] args) {
        int i = 3;
        int j = 56;

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        StringBuilder s3 = new StringBuilder();

        s1.append(i);
        System.out.println(s1 + "\n");

        s1.append(" + ");
        System.out.println(s1 + "\n");

        s1.append(j);
        System.out.println(s1 + "\n");

        s1.append(" = ");
        System.out.println(s1 + "\n");

        s1.append(i + j);
        System.out.println(s1 + "\n");

        s2.append(i);
        System.out.println(s2 + "\n");

        s2.append(" - ");
        System.out.println(s2 + "\n");

        s2.append(j);
        System.out.println(s2 + "\n");

        s2.append(" = ");
        System.out.println(s2 + "\n");

        s2.append(i - j);
        System.out.println(s2 + "\n");

        s3.append(i);
        System.out.println(s3 + "\n");

        s3.append(" * ");
        System.out.println(s3 + "\n");

        s3.append(j);
        System.out.println(s3 + "\n");

        s3.append(" = ");
        System.out.println(s3 + "\n");

        s3.append(i * j);
        System.out.println(s3 + "\n");

        s1.insert(s1.indexOf("="), "equals");
        s1.deleteCharAt(s1.indexOf("="));
        System.out.println(s1 + "\n");

        s2.insert(s2.indexOf("="), "equals");
        s2.deleteCharAt(s2.indexOf("="));
        System.out.println(s2 + "\n");

        s3.insert(s3.indexOf("="), "equals");
        s3.deleteCharAt(s3.indexOf("="));
        System.out.println(s3 + "\n");

        s1.replace(s1.indexOf("e"), s1.lastIndexOf(" "), "=");
        System.out.println(s1 + "\n");

        s2.replace(s2.indexOf("e"), s2.lastIndexOf(" "), "=");
        System.out.println(s2 + "\n");

        s3.replace(s3.indexOf("e"), s3.lastIndexOf(" "), "=");
        System.out.println(s3 + "\n");

    }

}
