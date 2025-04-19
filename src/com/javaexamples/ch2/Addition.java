package com.javaexamples.ch2;

/**
 * 
 *  @see : Program that inputs two numbers by the user and then displays their sum
 *  @author : Carlos Q.
 *  @serial : Fig 2.7 Addition.java
 *
 */

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		// Instantiate Scanner Class. Create a variable (object) of Scanner type.
		// Scanner enables the program to read data from file or keyboard.
		Scanner input = new Scanner(System.in); // System.in = source of data to read from. It indicates "to read bytes of data typed by the user"
		int num1;
		int num2;
		int sum;
		
		// By default java.lang is imported in every java program, thus, classes in java.lang are the ONLY java API that don't require import
		System.out.print("Provide first number to start addition: ");
		num1 = input.nextInt(); // Scanner method to obtain an integer from user using keyboard.
		
		System.out.print("Provide the second number to add: ");
		num2 = input.nextInt();
		
		input.close();
		
		sum = num1 + num2;
		System.out.printf("%s%d%s%d%s%d%n", "The total sum of ", num1, " and ", num2, " is ",  sum);
	}
	
}
