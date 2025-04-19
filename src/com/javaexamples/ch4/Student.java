/**
 * 
 *  @see : Creating a class that stores a student name and average
 *  @author : Carlos Q
 *  @serial : Exercise : Student.java
 *
 */

package com.javaexamples.ch4;

public class Student {

	private String name;
	private double average;
	
	public Student(String name, double average)
	{
		this.name = name;
		
		if (average > 0.0 && average <= 100)
			this.average = average;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAverage(double average)
	{
		if (average > 0.0 && average <= 100.0)
				this.average = average;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getAverage()
	{
		return average;
	}
	
	public String getGradeToLetter(double average)
	{
		String letterGrade = "";
		this.average = average;
		
		if (average < 100.0 && average >= 90.0)
			letterGrade = "A";
		else if (average < 90.0 && average >= 80.0)
			letterGrade = "B";
		else if (average < 80.0 && average >= 70.0)
			letterGrade = "C";
		else if (average < 70.0 && average >= 60.0)
			letterGrade = "D";
		else if (average < 60.0 && average >= 50.0)
			letterGrade = "E";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
}
