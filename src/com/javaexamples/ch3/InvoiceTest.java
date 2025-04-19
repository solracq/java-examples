package com.javaexamples.ch3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class InvoiceTest {
	
	public static void main(String[] args)
	{
		// Instantation
		Scanner input = new Scanner(System.in);
		Invoice invoice = new Invoice("TRL721R2D2", "BMW X6", 2, 70500.09);
		//Invoice invoice = new Invoice("TRL721R2D2", "BMW X6", -4, -5);
		
		// Calling the get methods
		String obtainSN = invoice.getItemNumber();
		String obtainDesc = invoice.getItemDescription();
		int obtainQnty = invoice.getItemQuantity();
		double obtainCost = invoice.getItemPrice();
		double obtainTotal = invoice.getInvoiceAmount(obtainQnty, obtainCost);
		
		// Displaying initial status
		System.out.println("=== Automotriz Quiroz - BMW Victoria ===");
		System.out.println("Lista de Autos Vendidos por Modelo");
		System.out.printf("%n%s%20s%20s%20s", "Numero de Serie", "Modelo Auto", "Cantidad", "Costo por Unidad");
		System.out.printf("%n%s%20s%20s%20s", obtainSN, obtainDesc, obtainQnty, obtainCost);
		
		// Request change gui 
		String newSN = JOptionPane.showInputDialog("Provide a new Serial Number : ");
		String newDesc = JOptionPane.showInputDialog("Provide a new Car Model : ");
		
		// Request Change scanner
		System.out.printf("%n%s", "Provide a new quantity: ");
		int newQnty = input.nextInt();
		System.out.printf("%n%s", "Provide a new price per item: ");
		double newCost = input.nextDouble();
		
		input.close();
		
		// Calling the Set methods
		invoice.setItemNumber(newSN);
		invoice.setItemDescription(newDesc);
		invoice.setItemQuantity(newQnty);
		invoice.setItemPrice(newCost);
		
		System.out.println("=== Automotriz Quiroz - BMW Victoria ===");
		System.out.println("Lista Actualizada de Autos Vendidos por Modelo");
		System.out.printf("%n%s%20s%20s%20s%20s", "Numero de Serie", "Modelo Auto", "Cantidad", "Costo por Unidad", "Costo Total");
		System.out.printf("%n%s%20s%20s%20s%20s", obtainSN, obtainDesc, obtainQnty, obtainCost, obtainTotal);
		System.out.printf("%n%s%20s%20s%20s%20s", invoice.getItemNumber(), invoice.getItemDescription(), invoice.getItemQuantity(), invoice.getItemPrice(), invoice.getInvoiceAmount(invoice.getItemQuantity(), invoice.getItemPrice()));
	}

}
