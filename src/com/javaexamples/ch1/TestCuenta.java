package com.javaexamples.ch1;

import java.util.Scanner;

public class TestCuenta
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner( System.in );
        Cuenta cuenta = new Cuenta(0.0);
        Cuenta cuenta2 = new Cuenta(50.0);

        System.out.printf("Showing initial balance on my new account1: $%.2f\n", cuenta.getBalance());
        
        System.out.print("Write the amount to depoist to the new account1: ");
        double amount = scanner.nextDouble(); 
        System.out.printf("Adding $%.2f to account1", amount);
        cuenta.depositToBalance(amount);
        System.out.printf("Balance of account1 : $%.2f \n", cuenta.getBalance());
        System.out.println("################################################");

        System.out.printf("Showing initial balance on my new account2: $%.2f\n", cuenta2.getBalance());
        System.out.print("Write the amount to depoist to the new account2: ");
        amount = scanner.nextDouble();
        scanner.close();
        System.out.printf("Adding %.2f to account2", amount);
        cuenta2.depositToBalance(amount);
        System.out.printf("\nBalance of account2 : $%.2f \n", cuenta2.getBalance());
    }
}