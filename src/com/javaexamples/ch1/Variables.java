package com.javaexamples.ch1;

public class Variables {
    // Declaring global variables
    public static final double PI = 3.1416;
    private static final double SUPERGOLDENRATIO = 1.46557;

    public static void main( String[] args) {
        System.out.println(PI);
        System.out.println(SUPERGOLDENRATIO);
        PI = 3;
        SUPERGOLDENRATIO = 3;
    }
}