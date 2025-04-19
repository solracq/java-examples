package com.javaexamples.ch7;

import java.util.Random;

public class DiceThrown {
    public static void main(String[] args) {
        Random randomInt = new Random();
        int n = 6000000;
        int randNum = 0;
        int[] array = new int[7]; // 0 ~ 6

        System.out.printf("Face%20s\n", "Frequency");
        for (int i = 1 ; i <= n ; i++) {
            randNum = randomInt.nextInt(6) + 1;
            array[randNum]++;
        }

        for (int i = 1 ; i <= 6 ; i++) {
            System.out.printf("%d%20d\n", i, array[i]);
        }
    }
}
