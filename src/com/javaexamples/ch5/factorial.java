package com.javaexamples.ch5;

public class factorial {
    public static void main(String[] args) {
        int n = 20;
        System.out.printf("Number%20s\n", "Factorial");
        for (int i=1 ; i <= n ; i++) {
            System.out.printf("%d%20d\n", i, (long)fact(i));
        }
    }
    
    public static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n-1);
    }
}
