package com.javaexamples.ch7;

import java.util.Random;

public class RandomMatrix {
    private static final int SIZE = 5;
    
    public static void main(String[] args){
        int[][] matrix = new int[SIZE][SIZE];

        matrix = generateMatrix(SIZE);
        printMatrix(matrix);
    }

    public static int[][] generateMatrix(int size) {
        Random randomNum = new Random();
        int randInt;
        int[][] matrix = new int[size][size];
        for (int i = 0 ; i < size ; i++) {
            for (int j = 0 ; j < size ; j++) {
                randInt = randomNum.nextInt(100);
                matrix[i][j] = randInt;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[i].length ; j++){
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
