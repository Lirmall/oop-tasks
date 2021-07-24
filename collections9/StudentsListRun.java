package oop.tasks.collections9;

public class StudentsListRun {
    public static void main(String[] args) {


        Student studentNo1 = new Student("Watson Jon", 315, 3, 3.1);
        Student studentNo2 = new Student("Ming Li", 211, 2, 4.6);
        Student studentNo3 = new Student("Smith Leila", 314, 3, 4.1);
        Student studentNo4 = new Student("Umen Jalal", 412, 4, 2.9);
        Student studentNo5 = new Student("Ivanov Dmitriy", 112, 1, 4.2);
        Student studentNo6 = new Student("Zangiev Sebastian", 112, 1, 2.8);
        Student studentNo7 = new Student("Yoshida Ken", 312, 3, 3.2);
        Student studentNo8 = new Student("U Phen Chi", 212, 2, 4.9);
        Student studentNo9 = new Student("Umuemu Vivi", 412, 4, 4.3);
        Student studentNo10 = new Student("Pakan Jam", 112, 1, 3.2);

        StudentsList allStudents = new StudentsList(studentNo1, studentNo2, studentNo3, studentNo4, studentNo5, studentNo6,
                studentNo7, studentNo8, studentNo9, studentNo10);

        StudentsList firstYearStudents = new StudentsList(studentNo5, studentNo6, studentNo10);
        StudentsList secondYearStudents = new StudentsList(studentNo2, studentNo8);
        StudentsList thirdYearStudents = new StudentsList(studentNo1, studentNo3, studentNo7);
        StudentsList fourthYearStudents = new StudentsList(studentNo4, studentNo9);

        System.out.println("All:");
        System.out.println(allStudents);
        System.out.println();

        System.out.println("First course:");
        System.out.println(firstYearStudents);
        System.out.println();

        System.out.println("Second course:");
        System.out.println(secondYearStudents);
        System.out.println();

        System.out.println("Third course:");
        System.out.println(thirdYearStudents);
        System.out.println();

        System.out.println("Fourth course:");
        System.out.println(fourthYearStudents);
        System.out.println();

        firstYearStudents.printStudentsList(allStudents.getStudentList(), 1);

        System.out.println();

        firstYearStudents.expulsionFromTheUniversity();
        System.out.println("First to second");
        System.out.println(firstYearStudents);
    }
}
