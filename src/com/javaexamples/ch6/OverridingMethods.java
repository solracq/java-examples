package com.javaexamples.ch6;

public class OverridingMethods {
    public static void main(String[] args) {
        System.out.printf("The square of int 7 is %d\n", square(7));
        System.out.printf("The square of double 7.5 is %.2f\n", square(7.5));
    }

    public static int square(int number) { // Overloaded method requires different parameter list
        System.out.printf("Called squrare with the argument int: %d\n", number);
        return number * number;
    }

    public static double square(double number) { // Overloaded method requires different parameter list
        System.out.printf("Called squrare with the argument double: %.2f\n", number);
        return number * number;
    }
}
