package com.javaexamples.ch6;

import java.util.Random;

public class DiceThrown {
    public static void main(String[] args) {
        Random randomInt = new Random();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int n = 6000000;
        int randResult = 0;

        System.out.printf("Face%20s\n", "Frequency");

        for (int i = 1 ; i <= n ; i++) {
            randResult = 1 + randomInt.nextInt(6);
            switch (randResult) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
                case 4:
                    count4++;
                    break;
                case 5:
                    count5++;
                    break;
                case 6:
                    count6++;
                    break;
            }
        }
        System.out.printf("1%20d\n", count1);
        System.out.printf("2%20d\n", count2);
        System.out.printf("3%20d\n", count3);
        System.out.printf("4%20d\n", count4);
        System.out.printf("5%20d\n", count5);
        System.out.printf("6%20d\n", count6);
    }
}
