/**
 * 
 *  @see : Creating and Manipulating an account object
 *  @author : Carlos Q
 *  @serial : 3.2 : AccountTest.java
 *
 */

package com.javaexamples.ch3;

import java.util.Scanner;
//import com.javaexamples.ch3.Account; // classes compailed in the same folder don't need to be imported.

public class AccountTest {
	
	public static void main(String[] args) {
		
		// Instantiating classes
		Scanner input = new Scanner(System.in);
		
		// Using the Account constructor to initialize the name instance variable at the time each Account object is created. 
		Account account = new Account("ys", 7002.11);
		Account account2 = new Account("car", 8900.12);
		
		String firstNameAcc1 = account.getName();
		String firstNameAcc2 = account2.getName();
		
		// Displaying initial instance variable value
		/*System.out.printf("%10s%n","=== Bank of Frankforth ===");
		System.out.printf("%s%20s%n","Client", "Account Balance");
		System.out.printf("%s%15s%n", account.getName(), account.getBalance());
		System.out.printf("%s%12s%n%n", account2.getName(), account2.getBalance());
		*/
		displayAccount(account); // Since the method was declared "static", thus, no new object needs to be created
		displayAccount(account2);
		
		// Requesting name from user
		System.out.println("Please add the client's last name for the account #1: ");
		String accountName = input.next();
		System.out.println("Please specify the amount to deposit for the accunt #1: ");
		double depositMoneyAcc1 = input.nextDouble();
		System.out.println("Please add the client's last name for the account #2: ");
		String accountName2 = input.next();
		System.out.println("Please specify the amount to deposit for the accunt #2: ");
		double depositMoneyAcc2 = input.nextDouble();
		System.out.println();
		
		// Setting the name with the info given
		account.setName(accountName);
		account2.setName(accountName2);
		
		// Adding the deposit to the existing balance
		account.deposit(depositMoneyAcc1);
		account2.deposit(depositMoneyAcc2);
		
		// Invoking setAccount method to set account name
		System.out.printf("%10s%n","*** New Balance Update ***");
		System.out.printf("%10s%n","=== Bank of Frankforth ===");
		System.out.printf("%s%20s%n","Client", "Account Balance");
		System.out.printf("%s%s%s%15s%n", firstNameAcc1, " ", account.getName(), account.getBalance());
		System.out.printf("%s%s%s%12s%n", firstNameAcc2, " ", account2.getName(), account2.getBalance());
		System.out.println();
		
		// Withdrawing from account
		System.out.println("Please specify the amount to withdraw from the account #1: ");
		double withdrawalMoneyAcc1 = input.nextDouble();
		
		System.out.println("Please specify the amount to withdraw from the account #2: ");
		double withdrawalMoneyAcc2 = input.nextDouble();
		System.out.println();
		
		// Withdraw amount from the account balance
		account.withdrawal(withdrawalMoneyAcc1);
		account2.withdrawal(withdrawalMoneyAcc2);
		
		input.close();
		
		// Invoking setAccount method to set account name
		System.out.printf("%n%n%10s%n","*** New Balance Update after Withdrawal ***");
		System.out.printf("%10s%n","=== Bank of Frankforth ===");
		System.out.printf("%s%20s%n","Client", "Account Balance");
		System.out.printf("%s%s%s%15s%n", firstNameAcc1, " ", account.getName(), account.getBalance());
		System.out.printf("%s%s%s%12s%n", firstNameAcc2, " ", account2.getName(), account2.getBalance());
	}
	
	public static void displayAccount(Account accountToDisplay)
	{
		System.out.printf("%10s%n","=== Bank of Frankforth ===");
		System.out.printf("%s%20s%n","Client", "Account Balance");
		System.out.printf("%s%15s%n", accountToDisplay.getName(), accountToDisplay.getBalance());
		System.out.println();
	}
}
