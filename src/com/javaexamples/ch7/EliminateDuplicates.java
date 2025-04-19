package com.javaexamples.ch7;

import java.util.Scanner;

public class EliminateDuplicates {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] nonDuplicateArray = new int[5];
        int count = 0;

        System.out.println("Provide a number between 0-100, and i will show you no duplicates.");
        int inputNum = scanner.nextInt();

        while (count < 5) {
            if (!containsDuplicate(inputNum, nonDuplicateArray))
                nonDuplicateArray[count] = inputNum;
            else {
                System.out.println("Detected a duplicate number. Provide another number between 0-100, and i will show you no duplicates.");
                inputNum = scanner.nextInt();

                while (containsDuplicate(inputNum, nonDuplicateArray)) {
                    System.out.println("Detected a duplicate number. Provide another number between 0-100, and i will show you no duplicates.");
                    inputNum = scanner.nextInt();
                }
                nonDuplicateArray[count] = inputNum;
            }

            showArrayElements(nonDuplicateArray);
            System.out.println();

            System.out.println("Provide a number between 0-100, and i will show you no duplicates.");
            inputNum = scanner.nextInt();
            count++;
        }
        scanner.close();
    }

    public static boolean containsDuplicate(int item, int[] array) {
        for (int element : array){
            if (element == item)
                return true;
        }
        return false;
    }

    public static void showArrayElements(int[] array){
        for (int item : array)
            System.out.printf("%d ", item);
    }
}
