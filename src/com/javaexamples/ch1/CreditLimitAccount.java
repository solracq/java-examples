package com.javaexamples.ch1;

/** Program to calculate if the client exceeds its montly credit limit. */

public class CreditLimitAccount {
    private static final int CREDITLIMIT = 5000;
    private int accountNumber = 0;
    private int initialMonthlyBalance = 0;
    private int totalMonthlyCharges = 0;
    private int totalCredit = 0;
    private int allowedCreditLimit = CREDITLIMIT;

    public CreditLimitAccount(int accountNumberIn, int initialMonthlyBalanceIn, int totalMonthlyChargesIn, int totalCreditIn, int allowedCreditLimitIn) {
        accountNumber = accountNumberIn;
        initialMonthlyBalance = initialMonthlyBalanceIn;
        totalMonthlyCharges = totalMonthlyChargesIn;
        totalCredit = totalCreditIn;
        allowedCreditLimit = allowedCreditLimitIn;
    }

    public void setAccountNumber(int accountNumberIn) {
        accountNumber = accountNumberIn;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setInitialMonthlyBalance(int initialMonthlyBalanceIn) {
        initialMonthlyBalance = initialMonthlyBalanceIn;
    }

    public int getInitialMonthlyBalance() {
        return initialMonthlyBalance;
    }

    public void setTotalMonthlyCharges(int totalMonthlyChargesIn) {
        totalMonthlyCharges = totalMonthlyChargesIn;
    }

    public int getTotalMonthlyCharges() {
        return totalMonthlyCharges;
    }

    public void setTotalCredit(int totalCreditIn) {
        totalCredit = totalCreditIn;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setAllowedCreditLimit(int allowedCreditLimitIn) {
        allowedCreditLimit = allowedCreditLimitIn;
    }
    
    public int getAllowedCreditLimit() {
        return allowedCreditLimit;
    }

    public int calculateNewBalance() {
        int newBalance = initialMonthlyBalance + totalMonthlyCharges - totalCredit;

        if (newBalance > getAllowedCreditLimit()) {
            System.out.printf("You have exceeded your credit limit by $%d!", allowedCreditLimit - newBalance);
        }
        else
            System.out.println("Congratulations you haven't exceeded your credit limit!");

        return newBalance;
    }
}