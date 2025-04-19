package com.javaexamples.ch2;

/**
 * 
 *  @see : Program that compares integers if statements, relational comparators
 *  @author : Carlos Q
 *  @serial : Fig 2.15 Comparison.java
 *
 */

import java.util.Scanner;

public class Comparison {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Input numbers by the user
		System.out.print("Provide the first number to compare : ");
		int num1 = input.nextInt();
		
		System.out.print("Provide the second number to compare: ");
		int num2 = input.nextInt();
		
		input.close();
		
		// Comparison Logic
		if (num1 == num2)
			System.out.printf("%d%s%d%n", num1, " is equal to ", num2);
		if (num1 != num2)
			System.out.printf("%d%s%d%n", num1, " is not equal to ", num2);
		if (num1 < num2)
			System.out.printf("%d%s%d%n", num1, " is less than ", num2);
		if (num1 > num2)
			System.out.printf("%d%s%d%n", num1, " is greater than ", num2);
		if (num1 <= num2)
			System.out.printf("%d%s%d%n", num1, " is less than or equal to ", num2);
		if (num1 >= num2)
			System.out.printf("%d%s%d%n", num1, " is greater than or equal to ", num2);
	}

}
