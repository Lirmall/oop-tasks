package oop.tasks.task2io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try(OutputStream output = new FileOutputStream("J:\\JavaIOFiles\\task2io\\task2IOFile.txt");
            InputStream input = new FileInputStream("J:\\JavaIOFiles\\task2io\\task2IOFile.txt")) {

            char[] symbols = {'a', 'b', 'c'};
            for (char symbol : symbols) {
                output.write(symbol);
            }
            int size = input.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Ошибка ввода-вывода: " + e);
        }
    }
}
