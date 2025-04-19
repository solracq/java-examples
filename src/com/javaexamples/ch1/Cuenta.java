package com.javaexamples.ch1;

public class Cuenta 
{
    private double balance;

    public Cuenta(double balance_usr) 
    {
        if (balance_usr > 0.0)
            balance = balance_usr;
        else
            System.err.println("You cannot input a value equal or lower than $0.0 !");
    }

    public void depositToBalance(double saldo)
    {
        if (saldo > 0.0)
            balance = balance + saldo;
        else
            System.err.println("You cannot input a value equal or lower than $0.0 !");
    }

    public double getBalance()
    {
        return balance;
    }

}
