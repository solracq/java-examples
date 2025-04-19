/** Program that compares two numbers given by the user 
 * Author: Carlos Q.
*/
package com.javaexamples.ch1;

import java.util.Scanner;

public class Comparacion {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        int num1;
        int num2;

        System.out.println("Comparing two numbers given by the user:");
        System.out.print("Provide the first number: ");
        num1 = scanner.nextInt();
        System.out.println();
        System.out.print("Provide the second number: ");
        num2 = scanner.nextInt();
        System.out.println();
        scanner.close();

        // Ternary operand " ?: "
        String formatedString = String.format("\t%d%s%d\n", num1, " == ", num2);
        System.out.printf(num1 == num2 ? formatedString : "Not equal!\n");

        if (num1 != num2) {
            System.out.printf("\t%d != %d\n", num1, num2);
        }

        if (num1 < num2) {
            System.out.printf("\t%d%s%d\n", num1, " < ", num2);
        }

        if (num1 <= num2) {
            System.out.printf("\t%d <= %d\n", num1, num2);
        }

        if (num1 > num2) {
            System.out.printf("\t%d%s%d\n", num1, " > ", num2);
        }

        if (num1 >= num2) {
            System.out.printf("\t%d >= %d", num1, num2);
        }
        
        System.out.println();
    }
}