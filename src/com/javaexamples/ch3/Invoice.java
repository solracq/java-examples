/**
 * 
 *  @see : Class to represent an invoice for an item sold at the store. With 4 instance variables 
 *  (String number, String description, int quantity_purchased_item, double price_per_item)
 *  A constructor should initialize the 4 instance variables.
 *  Provide a set and get methods for each instance variable
 *  Add a method "getInvoiceAmount" that calculates the invoice amount (multiplies the quantity by the price per item) 
 *       then returns the amount as double value
 *  	 If the quantity is not positive, it should set to 0
 *  	 If the price per item is not positive, it should be set to 0.0
 *  Show the usage of this app with a new test app, "InvoiceTest.java"
 *  @author : Carlos Quiroz
 *  @since : October 12th 2015
 *  @serial : Exercise : Invoice.java
 * 
 */

package com.javaexamples.ch3;

public class Invoice {
	
	// Declaring Instance Variables
	private String itemNumber;
	private String itemDescription;
	private int itemQuantity;
	private double itemPrice;

	// Declaring Constructor
	public Invoice(String itemNumber, String itemDescription, int itemQuantity, double itemPrice)
	{
		this.itemNumber = itemNumber;
		this.itemDescription = itemDescription;
		
		if (itemQuantity > 0)
			this.itemQuantity = itemQuantity;
		
		if (itemPrice > 0)
			this.itemPrice = itemPrice;
	}
	
	//========================================================
	// Declaring set method for itemNumber
	public void setItemNumber(String itemNumber)
	{
		this.itemNumber = itemNumber;
	}
	
	// Declaring set method for itemDescription
	public void setItemDescription(String itemDescription)
	{
		this.itemDescription = itemDescription;
	}
	
	// Declaring set method for itemQuantity
	public void setItemQuantity(int itemQuantity)
	{
		this.itemQuantity = itemQuantity;
	}
	
	// Declaring set method for itemPrice
	public void setItemPrice(double itemPrice)
	{
		this.itemPrice = itemPrice;
	}
	
	//========================================================
	// Declaring get method for itemNumber
	public String getItemNumber()
	{
		return itemNumber;
	}
	
	// Declaring get method for itemDescription
	public String getItemDescription()
	{
		return itemDescription;
	}
	
	// Declaring get method for itemQuantity
	public int getItemQuantity()
	{
		return itemQuantity;
	}
	
	// Declaring get method for itemPrice
	public double getItemPrice()
	{
		return itemPrice;
	}
	
	//============================================================
	// getInvoiceAmount method
	public double getInvoiceAmount(int itemQuantity, double itemPrice)
	{
		double result = 0.0;
		
		if (itemQuantity > 0 && itemPrice > 0.0) { // if itemQuantity is less than zero, it uses the initialized default value (0) applied to only the instance variable 
			this.itemQuantity = itemQuantity;
			this.itemPrice = itemPrice;
			result = itemQuantity * itemPrice;
		}
		return result;
	}
}
