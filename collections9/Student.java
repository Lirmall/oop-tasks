package oop.tasks.collections9;

public class Student {
    private final String name;
    private int group;
    private int studyYear;
    private double averageMark;

    public Student(String name, int group, int studyYear, double averageMark) {
        this.name = name;
        if (group < 0) {
            System.out.println("Group number can't be lesser than zero");
        } else {
            this.group = group;
        }

        if (studyYear < 0) {
            System.out.println("Number of study year can't be lesser than zero");
        } else {
            this.studyYear = studyYear;
        }
        if (averageMark < 0) {
            System.out.println("Average mark can't be lesser than zero");
        } else {
            this.averageMark = averageMark;
        }
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    @Override
    public String toString() {
        return name +
                ", group: " + group +
                ", studyYear: " + studyYear +
                ", averageMark: " + averageMark + "\n";
    }
}
