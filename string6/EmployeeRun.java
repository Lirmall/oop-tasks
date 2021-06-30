package oop.tasks.string6;

public class EmployeeRun {

    public static void main(String[] args) {
        Employee e1 = new Employee("Ivanov I.I.", "7249.26");
        Employee e2 = new Employee("Petrov P.P.", "7564.53");
        Employee e3 = new Employee("Sidorov S.S.", "7068.46");
        Employee e4 = new Employee("Ivanov I.I.", "7354.236");

        Employee[] list = {e1, e2, e3, e4};

        Report rep = new Report(list);

        rep.reporting2();
    }
}
