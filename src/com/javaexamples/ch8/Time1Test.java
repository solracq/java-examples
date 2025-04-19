package com.javaexamples.ch8;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();
        
        System.out.print("The universal initial time is: ");;
        System.out.println(time.aStringUniversal());
        System.out.print("The standard initial time is: ");
        System.out.println(time.toString());

        time.stablishTime(13, 27, 6);
        System.out.print("The universal time after stablishing the time is: ");;
        System.out.println(time.aStringUniversal());
        System.out.print("The standard time after stablishing the time is: ");
        System.out.println(time.toString());
        System.out.println();

        try {
            time.stablishTime(99, 99, 99);
        } 
        catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s\n\n", e.getMessage());
        }
        System.out.println("After trying wrong values:");
        System.out.print("The universal time is: ");;
        System.out.println(time.aStringUniversal());
        System.out.print("The standard time is: ");
        System.out.println(time.toString());
    }
}
