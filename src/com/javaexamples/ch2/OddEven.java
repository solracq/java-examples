/**
 * 
 *  @see : Program that reads an integer and determines and prints whetehr its odd or even
 *  @author : Carlos Q.
 *  @serial : Exercises : OddEven.java
 *
 */

package com.javaexamples.ch2;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Provide any integer and I will tell you whether is odd or even : ");
		int num = input.nextInt();
		
		input.close();
		
		if (num % 2 == 0)
			System.out.printf("%d%s", num, " is EVEN");
		else
			System.out.printf("%d%s", num, " is ODD");
	}
}
