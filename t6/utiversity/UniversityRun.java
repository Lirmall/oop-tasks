package oop.tasks.t6.utiversity;

public class UniversityRun {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Watson", "Biology", 5);
        Student student2 = new Student("Will", "Metson", "Biology", 3);
        Student student3 = new Student("Donald", "Willer", "Mathematica", 4);
        Student student4 = new Student("Kevin", "Malcolm", "Geography", 5);
        Student student5 = new Student("Kelly", "Mins", "Ecology", 5);

        Aspirant aspirant1 = new Aspirant("Malcolm", "Shildy", "Juristic", 5, "Ancient Greece laws");
        Aspirant aspirant2 = new Aspirant("Micky", "Minser", "Geography", 4, "Himalayas mountains");
        Aspirant aspirant3 = new Aspirant("Katy", "Milly", "Ecology", 5, "Biocenoses of the Andes");

        System.out.println("Студент " + student1.getFirstName() + " " + student1.getLastName() + " группа " + student1.getGroup());
        System.out.println("Студент " + student2.getFirstName() + " " + student2.getLastName() + " группа " + student2.getGroup());
        System.out.println("Студент " + student3.getFirstName() + " " + student3.getLastName() + " группа " + student3.getGroup());
        System.out.println("Студент " + student4.getFirstName() + " " + student4.getLastName() + " группа " + student4.getGroup());
        System.out.println("Студент " + student5.getFirstName() + " " + student5.getLastName() + " группа " + student5.getGroup());
        System.out.println();

        System.out.println("Аспирант " + aspirant1.getFirstName() + " " + aspirant1.getLastName() + " группа " + aspirant1.getGroup() + " "
                + "научная работа: " + aspirant1.getScientificWork());
        System.out.println("Аспирант " + aspirant2.getFirstName() + " " + aspirant2.getLastName() + " группа " + aspirant2.getGroup() + " "
                + "научная работа: " + aspirant2.getScientificWork());
        System.out.println("Аспирант " + aspirant3.getFirstName() + " " + aspirant3.getLastName() + " группа " + aspirant3.getGroup() + " "
                + "научная работа: " + aspirant3.getScientificWork());
        System.out.println();

        System.out.println("Студент " + student1.getFirstName() + " " + student1.getLastName() + " " + "средняя оценка: " + student1.getScholarship());
        System.out.println("Студент " + student2.getFirstName() + " " + student2.getLastName() + " " + "средняя оценка: " + student2.getScholarship());
        System.out.println("Студент " + student3.getFirstName() + " " + student3.getLastName() + " " + "средняя оценка: " + student3.getScholarship());
        System.out.println("Студент " + student4.getFirstName() + " " + student4.getLastName() + " " + "средняя оценка: " + student4.getScholarship());
        System.out.println("Студент " + student5.getFirstName() + " " + student5.getLastName() + " " + "средняя оценка: " + student5.getScholarship());
        System.out.println();

        System.out.println("Аспирант " + aspirant1.getFirstName() + " " + aspirant1.getLastName() + " " + "средняя оценка: " + aspirant1.getScholarship());
        System.out.println("Аспирант " + aspirant2.getFirstName() + " " + aspirant2.getLastName() + " " + "средняя оценка: " + aspirant2.getScholarship());
        System.out.println("Аспирант " + aspirant3.getFirstName() + " " + aspirant3.getLastName() + " " + "средняя оценка: " + aspirant3.getScholarship());
        System.out.println();

        Student[] students = new Student[8];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        students[4] = student5;
        students[5] = aspirant1;
        students[6] = aspirant2;
        students[7] = aspirant3;

        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
        System.out.println();

        Aspirant[] aspirants = new Aspirant[3];
        aspirants[0] = aspirant1;
        aspirants[1] = aspirant2;
        aspirants[2] = aspirant3;

        for (Aspirant a : aspirants) {
            System.out.println(a.getScholarship());
        }
    }
}
