package com.javaexamples.ch1;

import java.util.Scanner;

public class CalculateClassResTest {
    public static void main( String[] args ) {
        CalculateClassResults classRes = new CalculateClassResults("Math", 2);
        System.out.printf("Initial %s class contains %d students.\n", classRes.getClassName(), classRes.getNumberStudents());

        Scanner scanner = new Scanner( System.in );

        System.out.println("Provide a new class name? ");
        String newClassName = scanner.nextLine();
        classRes.setClassName(newClassName);
 
        System.out.println("Provide the number of students for the class? ");
        int newNumberStudents = scanner.nextInt();
        classRes.setNumberStudents(newNumberStudents);
 
        System.out.printf("The new %s class contains %d students.\n", classRes.getClassName(), classRes.getNumberStudents());
        classRes.calculateClassMetrics();
        
        scanner.close();
    }
}