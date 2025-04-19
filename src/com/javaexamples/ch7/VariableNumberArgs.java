package com.javaexamples.ch7;

public class VariableNumberArgs {
    public static double average(String subject, double... nums) {
        System.err.printf("Subjcet %s ", subject);
        double total = 0.0;
        double average = 0.0;

        for (double num : nums){
            total += num;
        }

        average = total / nums.length;
        return average;
    }

    public static void main(String[] args){
        String subject = "Mathematics";
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;
        
        System.out.printf("d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n", d1, d2, d3, d4);
        System.out.printf("The average of d1 and d2 is %.1f\n", average(subject, d1, d2));
        System.out.printf("The average of d1, d2 and d3 is %.1f\n", average(subject, d1, d2, d3));
        System.out.printf("The average of d1, d2, d3 and d4 is %.1f\n", average(subject, d1, d2, d3, d4));
    }
    
}
