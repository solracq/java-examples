package com.javaexamples.ch5;

public class ProductOddInts {
    public static void main(String[] args) {
        int product = 1;

        System.out.print("The product of the odd integers from 1 to 15 is: ");
        for (int i = 1 ; i <= 15 ; i++) {
            if (i % 2 == 0)
                continue;
            product *= i;
            System.out.printf("%d ", i);
            if (i < 15)
                System.out.print("* ");
            else
                System.out.print("= ");
        }
        System.out.printf("%d\n", product);
    }
    
}
