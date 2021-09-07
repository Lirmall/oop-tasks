package oop.tasks.task1io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {

        try (FileInputStream fileIn = new FileInputStream("J:\\JavaIOFiles\\task1io\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("J:\\JavaIOFiles\\task1io\\copied_file.txt")) {

            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
