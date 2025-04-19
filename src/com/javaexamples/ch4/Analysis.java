/**
 * 
 *  @see : Creating an application to do the analysis of examimation results, we use  NESTED - CONTROL STATEMENTS
 *  @author : Carlos Q
 *  @serial : Exercise : Analysis.java
 *
 */

package com.javaexamples.ch4;

import java.util.Scanner;

public class Analysis {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int counter = 1;
		int pass = 0;
		int fail = 0;
		
		while (counter <= 10)
		{
			System.out.printf("%s%d%s", "Provide pass/fail grade for student no. ", counter, " (1 = PASSED, 2 = FAILED) : ");
			int grade = input.nextInt();
			
			if (grade == 1 || grade == 2)
			{
				if (grade == 1)
				{
					System.out.printf("%s%d%s%d%n%n", "Student no. ", counter, " with ", grade);
					pass++;
				}
					
				if (grade == 2)
				{
					System.out.printf("%s%d%s%d%n%n", "Student no. ", counter, " with ", grade);
					fail++;
				}
			} else {
				System.out.println("Wrong number, the grade should be either 1 = PASSED or 2 = FAILED\n");
				break;
			}
			
			counter++;
		}
		
		System.out.printf("%s%d%n", "Students that PASSED : ", pass);
		System.out.printf("%s%d%n", "Students that FAILED : ", fail);
		
		if (pass >= 8)
			System.out.println("CONGRATULATIONS, THE INSTRUCTOR GETS A BONUS!");
		
		input.close();
	}

}
