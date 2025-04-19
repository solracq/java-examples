/**
 * 
 *  @see : Program that calculates the Body Mass Index
 *  @author : Carlos Q
 *  @serial : Exercises : BMIcalculator.java
 *
 */

package com.javaexamples.ch2;

import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Provide your weight : ");
		float weight = input.nextFloat();
		
		System.out.print("Provide your height : ");
		float height = input.nextFloat();
		
		input.close();
		
		float BMI = weight / (height * height);
		
		System.out.print("Your Body Mass Index (BMI) is : " + BMI + "\n");
		
		// BMI Standard Values
		if (BMI < 18.5)
			System.out.println("You are underweight, consider to eat more!");
		else if (BMI > 18.5 && BMI < 24.9)
		System.out.println("You are in good shape, keep up the good work!");
		else if (BMI > 25 && BMI < 29.9)
			System.out.println("You are overweight, consider to do some excersise!");
		else if (BMI >= 30)
			System.out.println("You are obese, consider to have a balanced diet and excersise");
	}
}
