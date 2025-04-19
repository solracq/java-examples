package com.javaexamples.ch8;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birthDate = new Date(7, 24, 1949);
        Date hireDate = new Date(01, 20, 2024);
        Employee employee = new Employee("Bob", "Blue", birthDate, hireDate);

        System.out.println(employee);
    }
    
}
