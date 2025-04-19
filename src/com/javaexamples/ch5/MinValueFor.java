package com.javaexamples.ch5;

import java.util.Scanner;
import java.util.Random;

public class MinValueFor {
    public static void main(String[] args) {
        int numInput;
        int min;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program to calculate the minimum value of a set of numbers.");
        System.out.println("Input the numbers and press ENTER, the first number will determine the number of inputs:");
        numInput = scanner.nextInt();
        min = numInput;
        int totalNumbers = Math.abs(numInput);

        if (numInput != 0) {
            for (int i = 2 ; i <= totalNumbers ; i++) {
                numInput = scanner.nextInt();
                if (min > numInput)
                    min = numInput;
            }
        }
        System.out.println("The minimum value in the set of " + totalNumbers + " numbers is: " + min);
    }
}
