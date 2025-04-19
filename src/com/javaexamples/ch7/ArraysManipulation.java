package com.javaexamples.ch7;

/* Manipulating arrays like 'lists' in Python */

import java.util.Arrays;

public class ArraysManipulation {
    public static void main(String[] args){
        double[] array = {8.4, 9.3, 0.2, 7.9, 3.4};

        System.out.println("Original Array: ");
        printArray(array);

        System.out.println("Sorting array:");
        Arrays.sort(array);
        printArray(array);
        // Prior using Arrays.binarySearch(), the array in matter must be sorted
        System.out.printf("Found 7.9 value in array at: %d\n", Arrays.binarySearch(array, 7.9));
        double[] newArray = Arrays.copyOf(array, array.length);
        System.out.println("Copy of the original array: ");
        printArray(newArray);
        Arrays.fill(newArray, 4, 5, 5.0);
        System.out.println("New array with a new value");
        printArray(newArray);
        System.out.println("Comparing two arrays (0-equal / 1-different): " + Arrays.compare(array, newArray));
    }

    public static void printArray(double[] array) {
        for (double item : array)
            System.out.printf("%.2f ", item);
        System.out.println();
    }
}
