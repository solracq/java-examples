package com.javaexamples.ch1;

public class Factorial {
    public static void main( String[] args) {
        int n = 5;
        int result  = 1;

        for (int i = n ; i >= 1 ; i--) {
            result *= i; 
        }
        System.out.println("Factorial of " + n + " is " + result);
    }
    
}
