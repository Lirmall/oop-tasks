package oop.tasks.t6.utiversity;

public class Aspirant extends Student {
    private String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public double getScholarship() {
       if (this.getAverageMark() == 5) {
           return 200;
       } else {
           return 180;
       }
    }
}
