/**
 * 
 *  @see : Account class that contains a name and balance instance variables and methods to set, get and deposit its value. It also contains a constructor to initialize 
 *  instance variables.
 *  @author : Carlos Q
 *  @serial : 3.1 : Account.java
 * 
 */


package com.javaexamples.ch3;

public class Account {

	private String name; // instance variable (attribute). "private" means that only the setName() and getName() methods can access to this variable
	private double balance;  // instance variable
	
	// If we want to initialize the instance variables of this class with a value, we use a constructor
	public Account(String name, double balance)   // The constructor has the same name as the class name and it doesn't return any type of value nor calls a method.
	{
		this.name = name;
		
		// Validating the balance is grater than 0.0; if it's not, instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0)
			this.balance = balance; // assign it to the instance variable balance
	}
	
	// method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0) // if the deposit amount id valid
			balance = balance + depositAmount;  // add it to the balance
	}
	
	// method to withdraw money from the account ensuring that the withdrawal amount doesn't exceed the balance.
	// If it does, the balance should be left unchanged and the method should print a message indicating "Withdrawal amount exceeded account balance"
	public void withdrawal(double withdraw)
	{
		// Validate the withdrawal amount doesn't exceed the balance
		if (withdraw < balance)
			balance = balance - withdraw ;
		else
			System.out.printf("%nWithdrawal amount %.2f exceeded account balance %.2f for client: %s", withdraw, balance, name);
	}
	
	// method to return the account balance
	public double getBalance()
	{
		return balance;
	}
	
	// method to setName(String name) (behaivor)
	public void setName(String name) 
	{
		// instance variable = local variable
		this.name = name; // Store the name
	}
	
	// method to retrieve the name from the object
	public String getName()
	{
		return name; // return of name to caller
	}
}
