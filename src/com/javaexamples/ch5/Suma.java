package com.javaexamples.ch5;
 
public class Suma {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        for (int i = 1 ; i <= n ; i++) {
            System.out.printf("%d + ", i);
            sum += i;
        }
        System.out.println("\nSuma = " + sum);
    }
}
