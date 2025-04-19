/** Program to call LibroCalificaciones class
 * Author: Carlos Q.
 */
package com.javaexamples.ch1;

import java.util.Scanner;

public class PruebaLibroCalificaciones {
    public static void main( String[] args) {
        Scanner scanner = new Scanner( System.in );
        LibroCalificaciones librocalificaciones1 = new LibroCalificaciones("Math");
        LibroCalificaciones librocalificaciones2 = new LibroCalificaciones("Physics");

        librocalificaciones1.showMessage();
        librocalificaciones2.showMessage();

        System.out.println("Write the name of a new subject for book 1: ");
        librocalificaciones1.setSubject(scanner.nextLine());
        System.out.println("Write the name of a new subject for book 2: ");
        librocalificaciones2.setSubject(scanner.nextLine());

        librocalificaciones1.showMessage();
        librocalificaciones2.showMessage();

        librocalificaciones1.determineClassAverage();
        librocalificaciones2.determineClassAverageCentinela();
        scanner.close();
    }
}
