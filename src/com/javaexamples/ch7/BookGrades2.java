package com.javaexamples.ch7;

public class BookGrades2 {
    private String subject;
    private int[][] grades;

    public BookGrades2(String subject_usr, int[][] grades_usr) {
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
        System.out.printf("%20s%10s%10s%10s\n", "Prueba1", "Prueba2", "Prueba3", "Average");
        for (int i = 0 ; i < grades.length ; i++) {
            int total = 0;
            double average = 0;
            System.out.printf("Student  %d:  ", i + 1);
            for (int j = 0 ; j < grades[i].length ; j++) {
                System.out.printf("  %d     ", grades[i][j]);
                total += grades[i][j];
            }
            average = (double) total / 3;
            System.out.printf("%10.2f", average);
            System.out.println();
        }
    }

    public double averageClass() {
        int total = 0;
        int average = 0;

        for (int[] gradeStudent : grades) {
            for (int grade : gradeStudent) {
                total += grade;
            }
        }
        average = total / grades.length;
        
        return average;
    }
    
    public int getLowestGrade() {
        int lowestGrade = grades[0][0];

        for (int[] gradeStudent : grades){
            for (int grade : gradeStudent) {
                if (lowestGrade > grade)
                    lowestGrade = grade;
            }
        }
        return lowestGrade;
    }

    public int getHighestGrade() {
        int highestGrade = grades[0][0];

        for (int[] gradeStudent : grades) {
            for (int grade : gradeStudent) {
                if (highestGrade < grade)
                    highestGrade = grade;
            }
        }
        return highestGrade;
    }

    public void distributionGrades() {
        System.out.println("Distribution of Grades");
        int[] frequency = new int[grades.length+1];

        for (int[] gradeStudent : grades) {
            for (int grade : gradeStudent) {
                ++frequency[ grade/10 ];
            }
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
