/**
 * 
 *  @see : Program that displays the integer equivalents of some uppercase letters, lowercase letters, digits and special symbols.
 *  		A B C  a b c 0 1 2 $ * + / ' ' (blank char)
 *  @author : Carlos Q.
 *  @serial : Exercises : IntCharacter.java
 *
 */

package com.javaexamples.ch2;

import java.util.Scanner;

public class IntCharacter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Provide any character to be converted to its integer equivalent : ");
		char character = input.findInLine(".").charAt(0); // To record the typed character into a variable
		
		input.close();
		
		System.out.printf("The character %c has the value of %d%n", character, (int) character);
	}

}
