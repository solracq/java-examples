/**
 * 
 *  @see : Program that compares 3 integers from user and displayes the sum, average, product, smallest and largest of the numbers
 *  @author : Carlos Quiroz
 *  @since : September 24th 2015
 *  @serial : Exercises : ComparisonComplex.java
 *
 */

package com.javaexamples.ch2;

import java.util.Scanner;

public class ComarisonComplex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Input numbers by the user
		System.out.print("Provide the first number to compare : ");
		int num1 = input.nextInt(); 
		System.out.print("Provide the second number to compare : ");
		int num2 = input.nextInt();
		System.out.print("Provide the third number to compare : ");
		int num3 = input.nextInt();
		
		input.close();
		
		// Operations
		int sum = num1 + num2 + num3;
		int average = (num1 + num2 + num3) / 3;
		int product = num1 * num2 * num3;
		
		System.out.printf("%s%d%n", "The sum of all numbers is : ", sum);
		System.out.printf("%s%d%n", "The average of all numbers is : ", average);
		System.out.printf("%s%d%n", "The product of all numbers is : ", product);
		
		// Comparison
		if (num1 == num2 && num2 == num3)
			System.out.printf("%d%s%d%s%d%s%n", num1, ", ", num2, " and ", num3, " are all equal");
		else {
			if (num1 > num2 && num1 > num3)
				System.out.printf("%s%d%n", "The biggest number is ", num1);
			else if (num2 > num1 && num2 > num3)
				System.out.printf("%s%d%n", "The biggest number is ", num2);
			else if (num3 > num1 && num3 > num2)
				System.out.printf("%s%d%n", "The biggest number is ", num3);
		
			if (num1 < num2 && num1 < num3)
				System.out.printf("%s%d%n", "The smallest number is ", num1);
			else if (num2 < num1 && num2 < num3)
				System.out.printf("%s%d%n", "The smallest number is ", num2);
			else if (num3 < num1 && num3 < num2)
				System.out.printf("%s%d%n", "The smallest number is ", num3);
		}
	}
}
