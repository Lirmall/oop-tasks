package oop.tasks.string6;

import java.math.BigDecimal;

public class Employee {
    String fullName;
    BigDecimal salary;

    public Employee(String fullName, String salary) {
        this.fullName = fullName;
        this.salary = new BigDecimal(salary);
    }

    public String getFullName() {
        return fullName;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
