package oop.tasks.t6.utiversity;

public class UniversityTests {
    public static void main(String[] args) throws IncorrectAverageMark {
        testStudentAverageMark();
        testAspirantAverageMark();
    }

    public static void testStudentAverageMark() throws IncorrectAverageMark {
        Student student1 = new Student("John", "Watson", "Biology", 3);
        double averageMark = student1.getAverageMark();
        assert averageMark > 0;
    }

    public static void testAspirantAverageMark() throws IncorrectAverageMark {
        Aspirant aspirant1 = new Aspirant(
                "Malcolm",
                "Shildy",
                "Juristic",
                5,
                "Ancient Greece laws");
        double averageMark = aspirant1.getAverageMark();
        assert averageMark > 0;
    }
}
