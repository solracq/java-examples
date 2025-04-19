/** Class that shows a message 
 * Author: Carlos Q.
*/

package com.javaexamples.ch1;

import java.util.Scanner;

public class LibroCalificaciones {
    private String subject;

    public LibroCalificaciones(String subject_usr) {
        subject = subject_usr;
    }

    public void setSubject(String name) {
        subject = name;
    }

    public String getSubject() {
        return subject;
    }

    public void showMessage() {
        String subject_given = getSubject();
        System.out.printf("Welcome to the Grade's Book for %s!\n", subject_given);
    }

    public void determineClassAverage() {
        Scanner scanner = new Scanner( System.in );
        int count = 1;
        double grade;
        double total = 0;
        double average;
        while (count <= 10) {
            System.out.printf("Write the grade for student%d : ", count);
            grade = scanner.nextDouble();
            total += grade;
            count += 1;
            System.out.println();
        }
        average = total / count;
        System.out.printf("The total of the %d grades is %.2f\n", count, total);
        String finalStatement = String.format("The average grade in the whole class is %.2f", average);
        System.out.println(finalStatement);
        scanner.close();
    }

    public void determineClassAverageCentinela() {
        Scanner scanner = new Scanner( System.in );
        int count = 1;
        double grade;
        double total = 0;
        double average;
        System.out.printf("Write the grade for student%d (for exit press -1) : ", count);
        grade = scanner.nextDouble();
        while ( grade != -1 ) {
            total += grade;
            count += 1;
            System.out.printf("Write the grade for student%d (for exit press -1) : ", count);
            grade = scanner.nextDouble();
        }
        if ( count > 1 )
            count -= 1;
        average = total / count;
        System.out.printf("The total of the %d grades is %.2f\n", count, total);
        String finalStatement = String.format("The average grade in the whole class is %.2f", average);
        System.out.println(finalStatement);
        scanner.close();
    }
}