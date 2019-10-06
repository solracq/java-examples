package com.javaexamples.ch3;

import java.util.Scanner;

import javafx.print.PrintColor;

public class CuentaBancoTest {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double x = 50.0;
		double y = 0.0;
		CuentaBanco cb1 = new CuentaBanco(x);
		CuentaBanco cb2 = new CuentaBanco(y);
		
		cb1.printCuenta(1);
		cb2.printCuenta(2);
		
		System.out.println("Escriba el monto a depositar para cuenta1: ");
		double num = input.nextDouble();
		
		System.out.printf("%nSumando %s al saldo de cuenta1 %n", num);
		cb1.deposit(x+num);
		
		cb1.printCuenta(1);
		cb2.printCuenta(2);
		
		System.out.println("\nEscriba el monto a depositar para cuenta2: ");
		num = input.nextDouble();
		
		System.out.printf("%nSumando %s al saldo de cuenta2 %n", num);
		cb2.deposit(y+num);
		
		cb1.printCuenta(1);
		cb2.printCuenta(2);
	}
}
