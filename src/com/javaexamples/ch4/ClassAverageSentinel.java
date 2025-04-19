/**
 * 
 *  @see : Creating an application to calculate the average of a known number of students' grades.
 *  	   Since the number of repetitions is NOT known before the loop begins we use  SENTINEL - CONTROLLED REPETITION
 *  @author : Carlos Q
 *  @serial : Exercise : ClassAverageSentinel.java
 *
 */

package com.javaexamples.ch4;

import java.util.Scanner;

public class ClassAverageSentinel {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double total = 0;
		int counter = 0;
		
		System.out.printf("%s", "Provide the student's grade (input -1 to stop) : ");
		double grade = input.nextDouble();
		
		while (grade != -1)
		{
			total = total + grade;
			counter = counter + 1;
			
			System.out.printf("%s", "Provide the next's student's grade (input -1 to stop) : ");
			grade = input.nextDouble();
		}
		
		if (counter != 0)
		{
			double average = total / counter;
			
			System.out.printf("%s%d%s%.2f%n", "The average grade of ", counter," students is ", average);
		}
		
		input.close();
	}

}
