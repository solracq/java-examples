package com.javaexamples.ch5;

/** Class to use the switch instruction to count the grade letters */

import java.util.Scanner;

public class LibroCalificaciones {
    private String subject;
    private int aCount = 0;
    private int bCount = 0;
    private int cCount = 0;
    private int dCount = 0;
    private int fCount = 0;
    private int counter = 0;
    private int total;
    private int grade;

    public LibroCalificaciones(String subjectUsr) {
        subject = subjectUsr;
    }

    public void setSubject(String subjectUsr) {
        subject = subjectUsr;
    }

    public String getSubject() {
        return subject;
    }

    public void showWelcomeMessage() {
        System.out.println("Welcome to the book of grades for " + getSubject() + "!\n");
    }

    public void inputGrades() {
        Scanner scanner = new Scanner(System.in);
        grade = 0;
        total = 0;

        System.out.println("Write the grades  as integers in the range 0-100.\n");
        System.out.println("Write the end of file indicator to finish the input: \nUnix/Linux/Mac OS X write <Ctrl> d and then press ENTTER.\nWindows write <Ctr>-z and then press ENTER");
        
        do {
            grade = scanner.nextInt();
            incrementCounter(grade);
            total += grade;
            counter++;
        } while (scanner.hasNext());
        scanner.close();
    }

    public void incrementCounter(int grade) {
        switch (grade / 10) {
            case 9:
            case 10:
                aCount++;
                break;
            case 8:
                bCount++;
                break;
            case 7:
                cCount++;
                break;
            case 6:
                dCount++;
                break;
            default:
                fCount++;
                break;
        }
    }

    public void showReport() {
        if (counter != 0) {
            System.out.println("The report of the grades.");
            System.out.println("The total of the " + counter + " grades is:" + total);
            System.out.printf("The average of the class is: %.2f\n", (double)total / counter);
            System.out.println("The number of students who received each grade:");
            System.out.printf("A: %d\nB: %d\nC: %d\nD: %d\nF: %d\n", aCount, bCount, cCount, dCount, fCount);
        }
        else {
            System.out.println("No grades were entered.");
        }
    }
}
