package oop.tasks.t6.utiversity;

public class UniversityRun {
    public static void main(String[] args) throws IncorrectAverageMarkException {
        Student student1 = new Student("John", "Watson", "Biology", 5);
        Student student2 = new Student("Will", "Metson", "Biology", 3);
        Student student3 = new Student("Donald", "Willer", "Mathematica", 4);
        Student student4 = new Student("Kevin", "Malcolm", "Geography", 5);
        Student student5 = new Student("Kelly", "Mins", "Ecology", 5);

        Aspirant aspirant1 = new Aspirant(
                "Malcolm",
                "Shildy",
                "Juristic",
                5,
                "Ancient Greece laws");
        Aspirant aspirant2 = new Aspirant(
                "Micky",
                "Minser",
                "Geography",
                4,
                "Himalayas mountains");
        Aspirant aspirant3 = new Aspirant(
                "Katy",
                "Milly",
                "Ecology",
                5,
                "Biocenoses of the Andes");

        System.out.println(
                "Student " + student1.getFirstName() +
                        " " + student1.getLastName() +
                        " group " + student1.getGroup());
        System.out.println(
                "Student " + student2.getFirstName() +
                        " " + student2.getLastName() +
                        " group " + student2.getGroup());
        System.out.println(
                "Student " + student3.getFirstName() +
                        " " + student3.getLastName() +
                        " group " + student3.getGroup());
        System.out.println(
                "Student " + student4.getFirstName() +
                        " " + student4.getLastName() +
                        " group " + student4.getGroup());
        System.out.println(
                "Student " + student5.getFirstName() +
                        " " + student5.getLastName() +
                        " group " + student5.getGroup());
        System.out.println();

        System.out.println(
                "Aspirant " + aspirant1.getFirstName() +
                        " " + aspirant1.getLastName() +
                        " group " + aspirant1.getGroup() +
                        " scientific work: " + aspirant1.getScientificWork());
        System.out.println(
                "Aspirant " + aspirant2.getFirstName() +
                        " " + aspirant2.getLastName() +
                        " group " + aspirant2.getGroup() +
                        " scientific work: " + aspirant2.getScientificWork());
        System.out.println(
                "Aspirant " + aspirant3.getFirstName() +
                        " " + aspirant3.getLastName() +
                        " group " + aspirant3.getGroup() +
                        " scientific work: " + aspirant3.getScientificWork());
        System.out.println();

        System.out.println(
                "Student " + student1.getFirstName() +
                        " " + student1.getLastName() +
                        " average mark: " + student1.getAverageMark());
        System.out.println(
                "Student " + student2.getFirstName() +
                        " " + student2.getLastName() +
                        " average mark: " + student2.getAverageMark());
        System.out.println(
                "Student " + student3.getFirstName() +
                        " " + student3.getLastName() +
                        " average mark: " + student3.getAverageMark());
        System.out.println(
                "Student " + student4.getFirstName() +
                        " " + student4.getLastName() +
                        " average mark: " + student4.getAverageMark());
        System.out.println(
                "Student " + student5.getFirstName() +
                        " " + student5.getLastName() +
                        " average mark: " + student5.getAverageMark());
        System.out.println();

        System.out.println(
                "Aspirant " + aspirant1.getFirstName() +
                        " " + aspirant1.getLastName() +
                        " average mark: " + aspirant1.getScholarship());
        System.out.println(
                "Aspirant " + aspirant2.getFirstName() +
                        " " + aspirant2.getLastName() +
                        " average mark: " + aspirant2.getScholarship());
        System.out.println(
                "Aspirant " + aspirant3.getFirstName() +
                        " " + aspirant3.getLastName() +
                        " average mark: " + aspirant3.getScholarship());
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
