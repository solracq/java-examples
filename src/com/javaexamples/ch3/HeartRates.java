/**
 * 
 *  @see : Creating a class to calculate heart reates of a person
 *  @author : Carlos Quiroz
 *  @since : October 15th 2015
 *  @serial : Exercise : HeartRates.java
 *
 */

package com.javaexamples.ch3;

import java.util.Calendar;

public class HeartRates {

	private String firstName;
	private String lastName;
	private int day;
	private int month;
	private int year;
	
	public HeartRates(String firstName, String lastName, int day, int month, int year)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public int calculatePersonAge(int year)
	{
		int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);
		int personAge = yearCurrent - year;
		
		return personAge;
	}
	
	public int calculateMaxHeartRate(int personAge)
	{
		int maxHeartRate = 220 - personAge;
		
		return maxHeartRate;
	}
	
	public double calculateTargetHeartRate(int maxHeartRate)
	{
		double targetHeartRate = maxHeartRate * 0.85;
		
		return targetHeartRate;
	}
}
