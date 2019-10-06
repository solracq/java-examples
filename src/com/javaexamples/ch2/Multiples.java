/**
 * 
 *  @see : Program that reads an integer and determines and prints whetehr its odd or even
 *  @author : Carlos Quiroz
 *  @since : September 25th 2015
 *  @serial : Exercises : OddEven.java
 *
 */

package com.javaexamples.ch2;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Provide first number to calculate multiple : ");
		int num1 = input.nextInt();
		
		System.out.print("Provide second number to calculate multiple : ");
		int num2 = input.nextInt();
		 
		input.close();
		
		if (num2 >= num1) {
			if (num2 % num1 == 0)
				System.out.printf("%d%s%d", num1, " is multiple of ", num2);
			else
				System.out.printf("%d%s%d", num1, " is NOT multiple of ", num2);
		} else if (num1 >= num2) {
			if (num1 % num2 == 0)
				System.out.printf("%d%s%d", num2, " is multiple of ", num1);
			else
				System.out.printf("%d%s%d", num2, " is NOT multiple of ", num1);
		}
	}
}
