package com.javaexamples.ch6;

public class IsPerfectNum {
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;
        int count = 0;
        int[] perfectNums = new int[3];

        System.out.println("The perfect numbers between 1 and " + n + " are: ");
        System.out.printf("Number%20s%20s\n", "Factors", "Sum");

        for (int num = 1; num <= n ; num++) {
            sum = 0;
            System.out.printf("%d\t\t", num);
            for (int i = 1 ; i < num ; i++) {
                if (num % i == 0) {
                    System.out.printf("%d ", i);
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.printf("%20d * It is a perfect number!\n", sum);
                perfectNums[count] = sum;
                count++;
            }
            System.out.println();
        }

        System.out.print("The total perfect numbers are: ");
        for (int perfectNum:perfectNums) {
            System.out.printf("%d ", perfectNum);
        }
        System.out.println();
        System.out.println(perfectNums.length);
    }
}
