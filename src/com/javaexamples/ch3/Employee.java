/**
 * 
 *  @see : Class to include three instance variables (String firstName, String lastName, double montlySalary) with constructor and their set and get methods 
 *       Create then a test app with tow employee objs and displays their yearly salary. Then 10% raise with yearly salary again.
 *  @author : Carlos Quiroz
 *  @since : October 14th 2015
 *  @serial : Exercise : Employee.java
 * 
 */

package com.javaexamples.ch3;

public class Employee {
	// declaring instance variables
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	// declaring constructor to initialize instance variables
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		if (monthlySalary > 0.0)
			this.monthlySalary = monthlySalary;
	}
	
	// declaring the SET methods for the instance variables
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setMonthlySalary(double monthlySalary)
	{
		this.monthlySalary = monthlySalary;
	}
	
	// declaring the GET methods for the instance variables
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public double getMonthlySalary()
	{
		return monthlySalary;
	}
	
	// declaring increase salary method
	public double increaseSalary(double monthlySalary, double increaseAmount)
	{
		double porcentageToDecimal = 0.0;
				
		if (increaseAmount > 0)
		{
			porcentageToDecimal = (increaseAmount/100) + 1;	
		} else {
			porcentageToDecimal = 1;	
		}
		
		if (monthlySalary > 0)
		{
			monthlySalary = monthlySalary * porcentageToDecimal;
			this.monthlySalary = monthlySalary;
		}
		
		return this.monthlySalary;
	}
}
