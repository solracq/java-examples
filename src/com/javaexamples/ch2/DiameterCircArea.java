/**
 * 
 *  @see : Program that inputs from the user the radius of a circle as an integer and prints the circle's diameter, circumference and area 
 *         using the floating-pint value of 3.1416 (Math.PI)
 *  @author : Carlos Quiroz
 *  @since : September 26th 2015
 *  @serial : Exercises : DiameterCircArea.java
 *
 */

package com.javaexamples.ch2;

import java.util.Scanner;

public class DiameterCircArea {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		double pi = Math.PI;
		
		System.out.print("Provide radius of a circle : ");
		int radius = input.nextInt();
		
		input.close();
		
		System.out.printf("%s%f%n", "Pi = ", pi);
		System.out.printf("%s%d%n", "Diameter = ", 2 * radius);
		System.out.printf("%s%f%n", "Circunference = ", 2 * pi * radius);
		System.out.printf("%s%f%n", "Area = ", pi * Math.pow(radius,2));
	}
}
