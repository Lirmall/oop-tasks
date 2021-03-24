package oop.tasks.t6.utivercity;

public class UnivercityRun {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Watson", "Biology", 5);
        Student student2 = new Student("Will", "Metson", "Biology", 3);
        Student student3 = new Student("Donald", "Willer", "Mathematic", 4);
        Student student4 = new Student("Kevin", "Malcolm", "Geography", 5);
        Student student5 = new Student("Kelly", "Mins", "Ecology", 5);

        Aspirant aspirant1 = new Aspirant("Malcolm", "Shildy", "Juristic", 5, "Ancient Greece laws");
        Aspirant aspirant2 = new Aspirant("Micky", "Minser", "Geography", 4, "Himalayas mountains");
        Aspirant aspirant3 = new Aspirant("Katy", "Milly", "Ecology", 5, "Biocenoses of the Andes");

        System.out.println(student1.getScholarship());
        System.out.println(student2.getScholarship());
        System.out.println(student3.getScholarship());
        System.out.println(student4.getScholarship());
        System.out.println(student5.getScholarship());

        System.out.println();

        System.out.println(aspirant1.getScholarship());
        System.out.println(aspirant2.getScholarship());
        System.out.println(aspirant3.getScholarship());

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
    }

}
