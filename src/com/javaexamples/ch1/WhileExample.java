package com.javaexamples.ch1;

/** Print the product of a number until reaching an specific value */

public class WhileExample {
    public static void main( String[] args ) {
        int product = 1;

        while ( product <= 100 ) {
            int result = product * 3;
            System.out.printf("%d * 3 = %d\n", product, result);
            product = result;
        }
    }
}
