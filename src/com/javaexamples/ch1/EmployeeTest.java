package com.javaexamples.ch1;

import java.util.Scanner;

public class EmployeeTest {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        Employee employee1 = new Employee("Mark", "S", 10000.58);
        Employee employee2 = new Employee("Jessica", "A", 1000.56);
        scanner.close();

        System.out.printf("Employee %s %s earns a yearly salary of %.2f\n", employee1.getName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);
        System.out.printf("Employee %s %s earns a yearly salary of %.2f\n\n", employee2.getName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);
        System.out.println("Increasing 10% of salary for both employees...\n");
        System.out.printf("Employee %s %s earns a new yearly salary of %.2f\n", employee1.getName(), employee1.getLastName(), (employee1.getMonthlySalary() * 1.10) * 12);
        System.out.printf("Employee %s %s earns a new yearly salary of %.2f\n", employee2.getName(), employee2.getLastName(), (employee1.getMonthlySalary() * 1.10) * 12);
    }
}
