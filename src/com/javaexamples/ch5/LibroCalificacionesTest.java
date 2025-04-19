package com.javaexamples.ch5;

/** Creates an object of 'LibroCalificaciones', input grades and shows a report. */

public class LibroCalificacionesTest {
    public static void main(String[] args) {
        LibroCalificaciones myLibroCalificaciones = new LibroCalificaciones("Mathematics");

        myLibroCalificaciones.showWelcomeMessage();
        myLibroCalificaciones.inputGrades();
        myLibroCalificaciones.showReport();
    }
}
