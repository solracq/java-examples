package com.javaexamples.ch1;

import java.util.Scanner;

public class CalculateClassResults {
    
    private String className = "Math";
    private int numberStudents = 10;
    
    public CalculateClassResults(String classNameUsr, int numberStudentsUsr) {
        className = classNameUsr;
        numberStudents = numberStudentsUsr;
    }

    public void setClassName(String classNameUsr) {
        className = classNameUsr;
    }

    public String getClassName() {
        return className;
    }

    public void setNumberStudents(int numberStudentsUsr) {
        numberStudents = numberStudentsUsr;
    }

    public int getNumberStudents() {
        return numberStudents;
    }

    public void calculateClassMetrics() {
        Scanner scanner = new Scanner( System.in );
        int countPass = 0;
        int countFail = 0;
        int countStudent = 1;
        int result;
        double mayority;

        System.out.printf("Calculating the %s class results for this term.\n", getClassName());
        while ( countStudent <= getNumberStudents() ) {
            System.out.printf("Provide the student %d grade status (1-Pass / 2-Fail) : ", countStudent);
            result = scanner.nextInt();
            if (result == 1)
                countPass++;
            else if (result == 2)
                countFail++;
            else
                System.err.println("\nInvalid number, only the following numbers are accepted: (1) for Pass or (2) for Fail");
            countStudent += 1;
        }
        if (countStudent == 1)
            countStudent = 1;
        else
            countStudent--;

        mayority = countStudent * 0.8;
        if (countPass >= (int) mayority)
            System.out.printf("Bonus for the professor! \nThis as %d students Passed.", countPass);
        else
            System.out.printf("No bonus as only %d students Passed!)", countPass);
        
        scanner.close();
    }
}