/**
 * 
 *  @see : Program that calculates the squates and cubes of the numbers from 0 to 10 and prints the result in table
 *  @author : Carlos Quiroz
 *  @since : September 27th 2015
 *  @serial : Exercises : SqCub.java
 *
 */

package com.javaexamples.ch2;

import java.util.Scanner;

public class SqCub {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Provide a number to calculate the sqare and cube from 0 to the given number : ");
		int num = input.nextInt();
		
		input.close();
		
		System.out.printf("%s%10s%10s%n", "number", "square", "cube");
		System.out.printf("%d%10d%10d%n", 0, 0, 0);
		
		for (int i = 1 ; i <= num ; i++) {
			System.out.printf("%s%10s%10s%n", i, Math.pow(i, 2), Math.pow(i, 3));
		}
	}

}
