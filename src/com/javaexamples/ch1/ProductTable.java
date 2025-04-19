package com.javaexamples.ch1;

import java.util.Scanner;

public class ProductTable {
    
    public static void main( String[] args ) {
        int num = 1;
        int tens = 1;
        int hundreds = 1;
        int thousands = 1;
        int tenthousands = 1;
        Scanner scanner = new Scanner( System.in );

        System.out.print("Provide the number of iterations to diplay for the product table: ");
        int iterations = scanner.nextInt();
        System.out.println();

        System.out.printf("N\t\t\t10*N\t\t\t100*N\t\t\t1000*N\t\t\t10000*N\n");

        while (num <= iterations) {
            tens = 10 * num;
            hundreds = 100 * num;
            thousands = 1000 * num;
            tenthousands = 10000 * num;
            System.out.printf("%d\t\t\t%d\t\t\t%d\t\t\t%d\t\t\t%d\n", num, tens, hundreds, thousands, tenthousands);
            num++;
        }
        scanner.close();
    }
}
