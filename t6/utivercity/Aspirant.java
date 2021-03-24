package oop.tasks.t6.utivercity;

public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
    double getScholarship() {
       if (this.averageMark == 5) {
           return 200;
       } else {
           return 180;
       }
    }
}
