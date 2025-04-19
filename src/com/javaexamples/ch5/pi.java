package com.javaexamples.ch5;

public class pi {
    public static void main(String[] args) {
        int n = 5;
        double piItems = 0;
        double piInitial = 4;
        System.out.printf("Result = %.2f - ", piInitial);
        for (int i = 1 ; i <= n ; i++) {
            if (i % 2 == 0)
                continue;
            if (i >= 3) {
                piItems += (4.00 / (double)i);
                System.out.printf("%.2f + ", piItems);
            }
        }
        System.out.printf("= %.2f\n", piInitial - piItems);
        System.out.printf("Result = %.2f\n", calculatePi(n));
    }

    public static double calculatePi(int n) {
        if (n == 1)
            return 4;
        else
            return 4 - (4.00 / (double)(n*2-1)) + calculatePi(n-1);
    } 
}
