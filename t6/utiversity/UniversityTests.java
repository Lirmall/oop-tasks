package oop.tasks.t6.utiversity;

public class UniversityTests {
    public static void main(String[] args) throws IncorrectAverageMarkException {
        testStudentAverageMark();
        testAspirantAverageMark();
        testIncorrectAverageMark();
    }

    public static void testStudentAverageMark() throws IncorrectAverageMarkException {
        Student student1 = new Student("John", "Watson", "Biology", 3);
        double averageMark = student1.getAverageMark();
        assert averageMark > 0;
    }

    public static void testAspirantAverageMark() throws IncorrectAverageMarkException {
        Aspirant aspirant1 = new Aspirant(
                "Malcolm",
                "Shildy",
                "Juristic",
                5,
                "Ancient Greece laws");
        double averageMark = aspirant1.getAverageMark();
        assert averageMark > 0;
    }

    public static void testIncorrectAverageMark() {
        try {
            Student student6 = new Student("Tim", "O'Nil", "Programming", -2);

            if (student6.getAverageMark() < 0 || student6.getAverageMark() > 5) {
                throw new IncorrectAverageMarkException();
            }
        } catch (IncorrectAverageMarkException e) {
            return;
        }
        assert false;
    }
}
