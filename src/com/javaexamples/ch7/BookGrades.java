package com.javaexamples.ch7;

import com.javaexamples.ch8.Book;

public class BookGrades {
    private String subject;
    private int[] grades;

    public BookGrades(String subject_usr, int[] grades_usr) {
        subject = subject_usr;
        grades = grades_usr;
    }

    public void setSubject(String subject_usr) {
        subject = subject_usr;
    }

    public String getSubject() {
        return subject;
    }

    public void showMessage() {
        System.out.printf("Welcome to the Book of Grades for %s!\n\n", getSubject());
    }

    public void processGrades() {
        printGrades();

        System.out.println("The average of class is : " + averageClass());
        System.out.println("The lowest grade is: " + getLowestGrade());
        System.out.println("The highest grade is: " + getHighestGrade());

        distributionGrades();
    }

    public void printGrades() {
        System.out.println("The Grades are: ");

        for (int i = 0 ; i < grades.length ; i++) {
            System.out.printf("Student  %d:  %d\n", i + 1, grades[i]);
        }
    }

    public double averageClass() {
        int total = 0;
        int average = 0;

        for (int i = 0 ; i < grades.length ; i++) {
            total += grades[i];
        }
        average = total / grades.length;
        
        return average;
    }
    
    public int getLowestGrade() {
        int lowestGrade = grades[0];

        for (int grade : grades){
            if (lowestGrade > grade)
                lowestGrade = grade;
        }
        return lowestGrade;
    }

    public int getHighestGrade() {
        int highestGrade = grades[0];

        for (int grade : grades) {
            if (highestGrade < grade)
                highestGrade = grade;
        }
        return highestGrade;
    }

    public void distributionGrades() {
        System.out.println("Distribution of Grades");
        int[] frequency = new int[grades.length+1];

        for (int grade : grades) {
            ++frequency[ grade/10 ];
        }

        for (int i = 1 ; i < grades.length ; i++) {
            if ( i == 10 )
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int j = 0 ; j <= frequency[i] ; j++)
                System.out.print("*");
    
            System.out.println();
        }
    }
}
