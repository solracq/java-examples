package com.javaexamples.ch7;

public class InitiateArray {
    public static void main(String[] args) {
        final int SIZE = 10;
        int[] array = new int[SIZE];
        int suma = 0;

        System.out.printf("Index%20s\n", "Value");

        for (int i = 0 ; i <= SIZE-1 ; i++) {
            array[i] = i  * 2 + 2;
            suma += array[i];
            System.out.printf("%d%20d ", i, array[i]);
            for (int j = 1 ; j <= array[i] ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Suma: " + suma);
    }
}
