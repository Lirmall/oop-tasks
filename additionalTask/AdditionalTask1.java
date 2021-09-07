package oop.tasks.additionalTask;

public class AdditionalTask1 {

    public static void main(String[] args) {
        boolean[] doors = new boolean[100];

        int i = 0;

        while (i < doors.length) {
            int j = i + 1;
            while (i < doors.length) {
                doors[i] = !doors[i];
                i = i + j;
            }
            i = j;
        }

        int k = 0;

        for (boolean b : doors) {
            if (b) {
                k++;
            }
            System.out.println(b);
        }

        System.out.println("There is " + (100 - k) + " closed doors");
    }
}
