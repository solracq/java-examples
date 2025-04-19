package com.javaexamples.ch8;

public class EmployeeStaticVarTest {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d\n", EmployeeStaticVar.getCount());

        EmployeeStaticVar employee1 = new EmployeeStaticVar("Susan", "Baker");
        EmployeeStaticVar employee2 = new EmployeeStaticVar("Bob", "Smith");

        System.out.println("\nEmployees after the instanciate: ");
        System.out.printf("Through employee1.getCount(): %d\n", employee1.getCount());
        System.out.printf("Through employee2.getCount(): %d\n", employee2.getCount());
        System.out.printf("Through Employee.getCount(): %d\n", EmployeeStaticVar.getCount());

        System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n\n", employee1.getFirstName(), employee1.getLastName(), employee2.getFirstName(), employee2.getLastName());

        // The following objects are candidates for garbage collection
        employee1 = null;
        employee2 = null;
    }
}
