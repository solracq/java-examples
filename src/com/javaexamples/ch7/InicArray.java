package com.javaexamples.ch7;

public class InicArray {
    public static void main(String[] args) {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] array2 = { {1, 2}, {3}, {4, 5, 6} };

        System.out.println("The values in array1 by row are: ");
        printArray(array1);
        System.out.println("The values in array2 by row are: ");
        printArray(array2);
    }

    public static void printArray(int[][] array) {
        for (int i = 0 ; i < array.length ; i++) {
            for (int j = 0 ; j < array[i].length ; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }
}