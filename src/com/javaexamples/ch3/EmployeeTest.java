package com.javaexamples.ch3;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args)
	{
		//Instantiating classes
		Scanner input = new Scanner(System.in);
		Employee employee1 = new Employee("Kj", "Ko", 5000.80);
		Employee employee2 = new Employee("Cam", "Sm", 7000.90);
		
		// Calling instance variables of the Employee Class
		String employee1FirstName = employee1.getFirstName();
		String employee1LastName = employee1.getLastName();
		double employee1MonthlySalary = employee1.getMonthlySalary();
		
		String employee2FirstName = employee2.getFirstName();
		String employee2LastName = employee2.getLastName();
		double employee2MonthlySalary = employee2.getMonthlySalary();
		
		// Displaying class objects variables content
		System.out.println(" ===== ABC COMPANY ===== ");
		System.out.printf("%s%20s%20s%20s%n", "Nombre", "Apellido", "Salario Mensual", "Salario Anual");
		System.out.printf("%s%20s%15.2f%20.2f%n", employee1FirstName, employee1LastName, employee1MonthlySalary, employee1MonthlySalary * 12);
		System.out.printf("%s%20s%15.2f%20.2f%n", employee2FirstName, employee2LastName, employee2MonthlySalary, employee2MonthlySalary * 12);
		
		// Increase Salary
		System.out.println("\nHow much percentage do you want to increase to the employees? : ");
		int increase =  input.nextInt();
		
		input.close();
		
		// Calling increaseSalary method from class Employee
		double employee1_IncreasedSalary = employee1.increaseSalary(employee1MonthlySalary, increase);
		double employee2_IncreasedSalary = employee2.increaseSalary(employee2MonthlySalary, increase);
		
		// Displaying class objects variables content
		System.out.println(" ===== ABC COMPANY ===== ");
		System.out.printf("%s%20s%20s%20s%n", "Nombre", "Apellido", "Salario Mensual", "Salario Anual");
		System.out.printf("%s%20s%15.2f%20.2f%n", employee1FirstName, employee1LastName, employee1_IncreasedSalary, employee1_IncreasedSalary * 12);
		System.out.printf("%s%20s%15.2f%20.2f%n", employee2FirstName, employee2LastName, employee2_IncreasedSalary, employee2_IncreasedSalary * 12);
	}
}
