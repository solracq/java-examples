package com.javaexamples.ch1;

import java.util.Scanner;

public class CreditLimitAccountTest {
    public static void main( String[] args) {
        Scanner scanner = new Scanner( System.in );
        boolean resp;
        int count = 1;
        int newBalance;

        System.out.println("Caluclating if the credit limit of a customer charges has been exceeded.\n");
        System.out.printf("Custeomer %d: \n", count);
        CreditLimitAccount customerInfo = new CreditLimitAccount(12345, 700, 4000, 300, 5000);
        System.out.printf(" Account Number = %d\n Initial Monthly Balance = $%d\n Total Monthly Charges of Items = $%d\n Total Applied Credit = $%d\n Allowed Credit Limit = $%d\n", 
        customerInfo.getAccountNumber(), customerInfo.getInitialMonthlyBalance(), customerInfo.getTotalMonthlyCharges(), customerInfo.getTotalCredit(), customerInfo.getAllowedCreditLimit());
        newBalance = customerInfo.calculateNewBalance();
        System.out.printf("\nNew Balance = $%d\n", newBalance);

        System.out.println("\nDo you want to add more customer data (true/false)? ");
        resp = scanner.nextBoolean();

        while (resp == true) {
            count++;
            System.out.printf("Custeomer %d : \n", count);
            System.out.println("Provide account number: ");
            customerInfo.setAccountNumber(scanner.nextInt());
            System.out.println("Provide Initial Monthly Balance: ");
            customerInfo.setInitialMonthlyBalance(scanner.nextInt());
            System.out.println("Provide Total Charges in current month: ");
            customerInfo.setTotalMonthlyCharges(scanner.nextInt());
            System.out.println("Provide Applied Credit in current month: ");
            customerInfo.setTotalCredit(scanner.nextInt());
            System.out.println("Provide Allowed Credit Limit: ");
            customerInfo.setAllowedCreditLimit(scanner.nextInt());

            System.out.printf(" Account Number = %d\n Initial Monthly Balance = $%d\n Total Monthly Charges of Items = $%d\n Total Applied Credit = $%d\n Allowed Credit Limit = $%d\n", 
            customerInfo.getAccountNumber(), customerInfo.getInitialMonthlyBalance(), customerInfo.getTotalMonthlyCharges(), customerInfo.getTotalCredit(), customerInfo.getAllowedCreditLimit());
            newBalance = customerInfo.calculateNewBalance();
            System.out.printf("\nNew Balance = $%d\n", newBalance);

            System.out.println("\nDo you want to add more customer data (true/false)? ");
            resp = scanner.nextBoolean();
        }

        scanner.close();
    }
}
