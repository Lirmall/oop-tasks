package oop.tasks.string5;

public class StudentsList {
    private final String lastName;
    private final String grade;
    private final String subject;

    public StudentsList(String lastName, String grade, String subject) {
        this.lastName = lastName;
        this.grade = grade;
        this.subject = subject;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getGrade() {
        return this.grade;
    }

    public String getSubject() {
        return this.subject;
    }

    public void studentList() {
        System.out.printf("Student %-15s received a grade of %-3s in the subject of %-10s\n", this.getLastName(), this.getGrade(), this.getSubject());
    }
}
