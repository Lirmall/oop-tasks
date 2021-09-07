package oop.tasks.task3io;

import java.io.*;

public class FileCopyByBufferedReaderWriter {
    public static void main(String[] args) {

        try (Reader bufferedReader = new BufferedReader(new FileReader("J:\\JavaIOFiles\\task4io\\file.txt"));
             Writer bufferedWriter = new BufferedWriter(new FileWriter("J:\\JavaIOFiles\\task4io\\copied_file.txt"))) {

            int i;
            while ((i = bufferedReader.read()) != -1) {
                bufferedWriter.write(i);
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
