package coreJava.classAndObject;

import java.time.LocalDate;

public class employee {
    //instance field
    private final String name;
    private double salary;
    private final LocalDate hireDay;

    //constructor
    public employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void doubleSalary(double x) {
        x = x * 2;
    }

}
