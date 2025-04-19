/** Program that asks user for two integers, then return the sum of the provided integers */
package com.javaexamples.ch1;

import java.util.Scanner;

public class Suma {
    public static void main( String[] args) {
        Scanner input = new Scanner( System.in );
        int num1;
        int num2;
        int result;

        System.out.println("Program that calculates the sum of two given numbers:");
        System.out.println("Give me first number: ");
        num1 = input.nextInt();
        System.out.println("Give me second number: ");
        num2 = input.nextInt();
        input.close();
        result = num1 + num2;
        System.out.printf("%d%s%d%s%d%s", num1, " + ", num2, " = ", result, "\n");
    }
}
