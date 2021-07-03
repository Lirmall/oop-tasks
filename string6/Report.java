package oop.tasks.string6;

public class Report {
    private final Employee[] list;

    public Employee[] getList() {
        return list;
    }

    public Report(Employee[] employees) {
        this.list = employees;
    }

    public void reporting2() {
        for (Employee employee : this.getList()) {
            System.out.printf("%1$-20s_____%2$15.2f%n", employee.getFullName(), employee.getSalary());
        }
    }
}
