/**
 * 
 *  @see : Creating an application to calculate the average of a known number of students' grades.
 *  	   Since the number of repetitions is known before the loop begins we use  COUNTER - CONTROLLED REPETITION
 *  @author : Carlos Q
 *  @serial : Exercise : ClassAverage.java
 *
 */

package com.javaexamples.ch4;

import java.util.Scanner;

public class ClassAverage {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		int counter = 1;
		
		while (counter <= 10)
		{
			System.out.printf("%s%d%s%n", "Provide grade of student no. ", counter, " : ");
			double grade = input.nextDouble();
			total = total + grade;
			counter = counter + 1;
		}
		
		input.close();
		double average = total / 10;
		
		System.out.printf("%n%s%.2f", "The Class Average is : ", average);
	}

}
