package oop.tasks.task3io;

import java.io.*;

public class FileCopyByFileReaderWriter {
    public static void main(String[] args) {

        try (Reader fileReader = new FileReader("J:\\JavaIOFiles\\task3io\\file.txt");
             Writer fileWriter = new FileWriter("J:\\JavaIOFiles\\task3io\\copied_file.txt")) {

            int i;
            while ((i = fileReader.read()) != -1) {
                fileWriter.write(i);
            }

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
