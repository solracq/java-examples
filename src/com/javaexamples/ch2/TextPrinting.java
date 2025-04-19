package com.javaexamples.ch2;

/** 
 *  @see : Program that prints out a welcome message from Java
 *  @author : Carlos Q
 *  @serial : Fig 2.1 TextPrinting.java
 */

public class TextPrinting {

	// Execution of java application
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java Programming!");
		System.out.print("Welcome to Car ");
		System.out.println("Quiroz \n");
		System.out.println("Java \nis \ncool");
		System.out.printf("%s%n%s%n%s", "Welcome to", "Java Programming ", "using formated print");  // %s = format specifier for string
																									 // %n = format specifier for new line only use it when printf
	} // end method main

} // end class
