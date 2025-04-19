 /** Comentaros para Javadoc */
/* Primer programa de Java
 * Hello World!
 * 
 * Author: Carlos Q.
 */
package com.javaexamples.ch1;

import java.util.Scanner;

public class Welcome1 {
    /**
     * @param args
     */
    public static void main( String[] args ) {
                            //   |-------> Parameter: variable that stores the argument (part of the method definition)
        System.out.print("Hello World!\n");
                         //     |--------> Argument: What you pass to the method (pass of the calling)
        System.out.println("Welcome to Java Progamming!");

        Scanner scanner = new Scanner( System.in );
        System.out.print("What is your name? : ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.printf("\nHello %s!\n", name);
    }
}
