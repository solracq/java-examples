package com.javaexamples.ch1;

import java.util.Scanner;

public class CalculateMaxNumber {
    public static final int TOTALCOUNTS = 10;
    public static void main( String[] args ) {
        int num;
        int max;
        int count = 1;
        Scanner scanner = new Scanner( System.in );

        System.out.println("Program that returns the biggest number while user input upto 10 numbers");
        System.out.print("Provide the first number: ");
        num = scanner.nextInt();
        System.out.println();
        max = num;
        System.out.printf("The maximum number so far is: %d", max);

        while (count < TOTALCOUNTS) {
            count++;
            System.out.print("\nProvide the next number: ");
            num = scanner.nextInt();
            System.out.println();
            if (max < num)
                max = num;
            System.out.printf("The maximum number so far is: %d", max);
        }
        scanner.close();
    }
    
}
