package com.javaexamples.ch3;

/**
 * 
 *  @see : Chapter Review class to apply the learned so far.
 *  @author : Carlos Quiroz (I A.M. CANADIAN)
 *  @since : Febrary 16th 2016
 *  @serial : ChReview.java
 * 
 */

public class ChReview extends Invoice {
	
	private String name;
	private String lastName;
	private int day;
	private int month;
	private int year;
	private double salary;
	
	public ChReview(String name, String lastName, int day, int month, int year, double salary, String itemNumber, String itemDescription, int itemQuantity, double itemPrice)
	{
		super(itemNumber, itemDescription, itemQuantity, itemPrice);
		
		this.name = name;
		this.lastName = lastName;
		
		if (day >= 1 && day <= 31)
			this.day = day;
		
		if (month >= 1 && month <= 12)
			this.month = month;
		
		if (year >= 1970 && year <= 2020)
			this.year = year;
		
		if (salary > 0.0)
			this.salary = salary;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setDay(int day)
	{
		if (day >= 1 && day <= 31)
			this.day = day;
	}

	public void setMonth(int month)
	{
		if (month >= 1 && month <= 12)
			this.month = month;
	}
	
	public void setYear(int year)
	{
		if (year >= 1970 && year <= 2020)
			this.year = year;
	}
	
	public void setSalary(double salary)
	{
		if (salary > 0.0)
			this.salary = salary;
	}
	
	public String getName()
	{
		return name;
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
	
	public double getSalary()
	{
		return salary;
	}
	
	public double calculateYearSalary(double salary)
	{
		double salaryYr = 0.0;
		if (salary > 0.0)
			salaryYr = salary * 12;
		
		return salaryYr;
	}
	
	public double calculateAfterTaxYrSalary(double salaryYr)
	{
		double realSalary = 0.0;
		if (salary > 0.0)
			realSalary = salaryYr - (salaryYr * 0.4);
		
		return realSalary;
	}
}
