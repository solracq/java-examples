package com.javaexamples.ch6;

import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        Random randomInt = new Random();

        for (int i = 1 ; i <= 20 ; i++) {
            System.out.printf("%d ", randomInt.nextInt(6) + 1);

            if (i % 5 ==0)
                System.out.println();
        }
        System.out.println("\nSpaced Random Integers");
        spacedRandomInt();
    }
    
    public static void spacedRandomInt() {
        Random randomInt = new Random();
        int randomNum;
        for (int i = 1 ; i <= 5 ; i++) {
            // RandomNum = valorDesplazamiento + diferenciaEntreValores + numerosAleatorios.nextInt( factorEscala )
            randomNum = 2 + 3 * randomInt.nextInt(5);
            System.out.printf("%d ", randomNum);
            // to set the random function to use the same seed for debugging purposes
            // randomInt.setSeed(i);
        }
        System.out.println();
    }
}
