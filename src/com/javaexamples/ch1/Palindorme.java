package com.javaexamples.ch1;

import java.util.Scanner;

public class Palindorme {
    public static final int MAX = 5;

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        int num = 0;
        int sizeNum = 0;

        System.out.println("Program to determine if a 5 digit number is a palindrome");
        System.out.println("Input a 5 digit number: ");
        num = scanner.nextInt();
        sizeNum = (int) (Math.log10(num) + 1);

        while ( sizeNum < MAX ) {
            System.err.println("Number is not 5 digits! Try again.");
            System.out.println("Input a 5 digit number: ");
            num = scanner.nextInt();
            sizeNum = (int) (Math.log10(num) + 1);
        }

        int[] numArray = separateNums(num);
        int[] reversedArray = reverseArray(numArray);

        if (compareArrays(numArray, reversedArray))
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number is not a palindrome");

        scanner.close();
    }

    public static int[] separateNums(int nums) {
        int digit = 0;
        int res = 0;
        int divisor = 10000;
        int[] numArray = new int[MAX];
        for (int i = 0 ; i < MAX ; i++) {
            digit = nums / divisor;
            res = (int) (nums % divisor);
            numArray[i] = digit;
            divisor /= 10;
            nums = res;
        }
        return numArray;
    }

    public static int[] reverseArray(int[] numArray) {
        int[] reversedArray = new int[MAX];
        for (int i = MAX - 1 ; i >= 0 ; i--) {
            reversedArray[MAX-(i+1)] = numArray[i];
        }
        return reversedArray;
    }

    public static boolean compareArrays(int[] numArray, int[] reversedArray) {
        for (int i = 0 ; i < MAX ; i++ ) {
            if (numArray[i] != reversedArray[i])
                return false;
        }
        return true;
    }
}