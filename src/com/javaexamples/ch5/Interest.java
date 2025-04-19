package com.javaexamples.ch5;

/** Calculates the compost interest using for
 * formula: a = p(1 + r)^n
 * where:
 * p = principal amount
 * r = interest rate (0.05 for 5%)
 * n =  number of years
 */

import java.util.Scanner;

public class Interest {
    public static void main( String[] args) {
        double p = 1000;
        double r = 0.05;
        int n = 10;
        double deposit = 0;

        System.out.printf("%s%20s\n", "Year", "Deposit");
        for (int i = 1 ; i <= n ; i++) {
            deposit = p * Math.pow(1 + r, i);
            System.out.printf("%4d%,20.2f\n", i, deposit); // The coma in the format string is used to separate the thousands
        }
    }
}