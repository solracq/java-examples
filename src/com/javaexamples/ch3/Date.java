/**
 * 
 *  @see : Class to display date
 *  @author : Carlos Quiroz
 *  @since : October 15th 2015
 *  @serial : Exercise : Date.java
 * 
 */

package com.javaexamples.ch3;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year)
	{
		if (day > 0 && day <= 30)
			this.day = day;
		
		if (month > 0 && month <= 12)
			this.month = month;
		
		if (year >= 1977 && month <= 2020)
			this.year = year;
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
	
	public String displayDate(int day, int month, int year)
	{
		String message = null; 
				
		if ((day > 0 && day <= 30) && (month > 0 && month <= 12) && (year >= 1977 && month <= 2020))
		{
			this.day = day;
			this.month = month;
			this.year = year;
			
			//System.out.printf("%s%d%s%d%s%d%n", "DATE : ", day, "/", month, "/", year);
			message = String.format("%s%d%s%d%s%d%n", "DATE : ", day, "/", month, "/", year);
		}
		
		return message;
	}
	
}
