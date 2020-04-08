package coreJava.classAndObject;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        employee employeeOne = new employee("Aedgen", 100.00, 1992, 11, 28);
        LocalDate localDate = LocalDate.of(1992, 11, 28);
        System.out.println(localDate.getMonthValue());
        employeeOne.doubleSalary(employeeOne.getSalary());
        System.out.print(employeeOne.getSalary());
    }
}
