package oop.tasks.t6.utiversity;

public class Student {
    private String firstName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setGroup(group);
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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public double getScholarship () {
        if (this.getAverageMark() == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
