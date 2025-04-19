package com.javaexamples.ch7;

public class BookGradesTest {
    public static void main(String[] args) {
        int[] arrayGrades = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        BookGrades myBookGrades = new BookGrades("Math", arrayGrades);
        myBookGrades.showMessage();
        myBookGrades.processGrades();
    }
    
}
