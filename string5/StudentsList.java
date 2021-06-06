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
        return lastName;
    }

    public String getGrade() {
        return grade;
    }

    public String getSubject() {
        return subject;
    }

    public void studentList (String lastName, String grade, String subject) {

        StringBuffer i = new StringBuffer();
        i.setLength(15);
        StringBuffer j = new StringBuffer();
        j.setLength(3);
        StringBuffer k = new StringBuffer();
        k.setLength(10);

        for (int l = 0; l < (lastName.length()); l++) {
            i.setCharAt(l, lastName.charAt(l));
        }

        for (int l = 0; l < (grade.length()); l++) {
            j.setCharAt(l, grade.charAt(l));
        }

        for (int l = 0; l < (subject.length()); l++) {
            k.setCharAt(l, subject.charAt(l));
        }
        System.out.println("Student " + i + " received a grade of " + j + " in the subject of " + k);
    }
}
