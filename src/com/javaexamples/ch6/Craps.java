package com.javaexamples.ch6;
 
/** The clase Craps simulates the dice game "craps". */

import java.util.Scanner;
import java.util.Random;

public class Craps {
    private enum Status {CONTINUE, WON, LOST};
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumDice = 0;
        int point = 0;
        Status gameStatus = Status.CONTINUE;

        System.out.println("Welcome to Craps!");
        System.out.println("Press Enter to roll the dice...");
        scanner.nextLine();
        sumDice = rollDice();

        switch (sumDice) {
            case 11:
            case 7:
                gameStatus = Status.WON;
                System.out.println("You Win!");
                break;
            case 2:
            case 3:
            case 12:
                gameStatus = Status.LOST;
                System.out.println("You Lose!");
                break;
            default:
                gameStatus = Status.CONTINUE;
                point = sumDice;
                System.out.println("Point is " + point);
                break;
        }
        
        if (gameStatus == Status.WON || gameStatus == Status.LOST) {
            System.exit(0);
        }
        
        if (point != 0) {
            do {
                System.out.println("Press Enter again to roll the dice...");
                scanner.nextLine();
                sumDice = rollDice();
                if (sumDice != point && sumDice != 7) {
                    System.out.println("Roll again!");
                    scanner.nextLine();
                    sumDice = rollDice();
                } else if (sumDice == point) 
                    System.out.println("You Win!");
                else
                    System.out.println("You Lose!");

            } while (sumDice != point && sumDice != 7);
        }
        scanner.close();
    }
    
    public static int rollDice() {
        int sum = 0;
        int dice1 = 0;
        int dice2 = 0;
        Random randInt = new Random();

        dice1 = randInt.nextInt(6) + 1;
        dice2 = randInt.nextInt(6) + 1;

        sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + sum);
        return sum;
    }

}
