package com.javaexamples.ch7;

public class StudentsPoll {
    public static void main(String[] args) {
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
        int[] frequency = new int[6];

        for (int i = 0 ; i < responses.length ; i++) {
            try {
                frequency[responses[i]]++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf(" responses[%d] = %d\n\n", i, responses[i]);
            }
        }

        System.out.printf("%s%10s\n", "Rating", "Frequency");
        for (int i = 1 ; i <= frequency.length - 1 ; i++) {
            System.out.printf("%d%10d\n", i, frequency[i]);
        }
    }
    
}
