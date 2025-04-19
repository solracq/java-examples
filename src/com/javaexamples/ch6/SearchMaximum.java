package com.javaexamples.ch6;

import java.util.Scanner;

public class SearchMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three float values separated by spaces: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("The maximum value is: " + max(a, b, c)); // Calling a static method from a static method

        double max2 = Math.max(a, Math.max(b,c));
        System.out.println("max2: " + max2);

        // Attempting to call a non-static method from a static method
        //noStaticMethod(); // This will not compile

        scanner.close();
    }

    public static double max(double a, double b, double c) {
        double max = a; 

        if (max < b)
            max = b;
        
        if (max < c)
            max = c;
        
        return max;
    }

    public void noStaticMethod() {
        System.out.println("This is a non-static method");
    }

    public void noStaticMethod2() {
        System.out.println("This is a non-static method");
        noStaticMethod();
        SearchMaximum.max(0, 0, 0);  // This will compile - calling a static method from a non-static method
    }
}
