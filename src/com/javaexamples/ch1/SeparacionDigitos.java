/** Program that separates into digits the provided number by the user. 
 * Author: Carlos Q.
*/
package com.javaexamples.ch1;

import java.util.Scanner;

public class SeparacionDigitos {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        System.out.print("Provide an integer number then I will separte its digits for you: ");
        int number = scanner.nextInt();
        scanner.close();
        
        // Calcualte the size of the provided number
        int numSize = (int) Math.round(Math.log10(number) + 1);

        // Calculate the separation of numbers
        getDigit(number, numSize);
        System.out.println();
    }

    public static int getDivisor( int number, int numSize ) {
        /** Method to calculate the divisor 
         * Arguments:
         *  number {int}: The number to separate its digits
         *  numSize {int}: The size of 'number'
         * 
         * Returns:
         *  divisor {int}: The 'divsor' necessary to divide and get the reminder of the 'number'
        */
        int divisor = 1;
        for (int i = 1; i < numSize; i++) {
            divisor *= 10;
        }
        return divisor;
    }

    public static void getDigit( int number, int numSize) {
        /* Method to calculate and separate the digits of the provided 'number'.
         * Arguments:
         *  number {int}: The number to separate its digits
         *  numSize {int}: The size of 'number'
         */
        int digit = 0;
        int divisor = getDivisor(number, numSize);

        for ( int i = 1 ; i <= numSize ; i++ ) {
            digit = Math.round(number / divisor);
            System.out.printf("%d ", digit);
            number = number % divisor;
            divisor = divisor / 10;
        }
    }
}
