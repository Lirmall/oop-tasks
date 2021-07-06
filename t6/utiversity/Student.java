package oop.tasks.t6.utiversity;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) throws IncorrectAverageMarkException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.setAverageMark(averageMark);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) throws IncorrectAverageMarkException {
        if (averageMark < 0 || averageMark > 5) {
            throw new IncorrectAverageMarkException();
        } else {
            this.averageMark = averageMark;
        }
    }

    public double getScholarship() {
        if (this.getAverageMark() == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
