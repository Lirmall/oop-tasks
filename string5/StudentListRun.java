package oop.tasks.string5;

public class StudentListRun {
    public static void main(String[] args) {
        StudentsList sl1 = new StudentsList("Ivanov", "5", "Math");
        StudentsList sl2 = new StudentsList("Petrov", "3", "Biology");
        StudentsList sl3 = new StudentsList("Sidorova", "5", "Progr");

        sl1.studentList();
        sl2.studentList();
        sl3.studentList();

    }
}
