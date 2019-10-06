package com.javaexamples.ch3;

public class ChReviewTest {

	public static void main(String[] args){
		
		System.out.printf("%s%20s%20s%20s%20s%20s%20s%20s%20s%20s%n", "Name", "Last Name","Date of Birth", "Monthly Salary", "Yearly Salary", "After Tax Salary", "Numero de Serie", "Modelo Auto", "Cantidad", "Costo por Unidad");
		
		ChReview employee1 = new ChReview("Carlitos", "Quiroz", 9, 12, 2014, 9000, "TRL721R2D2", "BMW X6", 2, 70500.09);
		
		displayEmployeeInfo(employee1);
		
		// Change Employee 1
		employee1.setName("Yu Quiroz");
		employee1.setLastName("Zhang");
		employee1.setDay(3);
		employee1.setMonth(10);
		employee1.setYear(1983);
		employee1.setSalary(3000);
		
		displayEmployeeInfo(employee1);
		
		// Create new Employee 2
		ChReview employee2 = new ChReview("cArLoS", "Papa", 19, 8, 1977, 6000, "TDFESS4242", "BMW 4 Series", 5, 81500.09);
		
		displayEmployeeInfo(employee2);
	}
	
	public static void displayEmployeeInfo(ChReview employee) 
	{
		System.out.printf("%s%14s%s", employee.getName(), employee.getLastName(), "          ");
		//System.out.printf("%14v", displayDate(employee));
		displayDate(employee);
		System.out.printf("%20s", employee.getSalary());
		System.out.printf("%20s", employee.calculateYearSalary(employee.getSalary()));
		System.out.printf("%20s", employee.calculateAfterTaxYrSalary(employee.calculateYearSalary(employee.getSalary())));
		System.out.printf("%20s%20s%20s%20s%n", employee.getItemNumber(), employee.getItemDescription(), employee.getItemQuantity(), employee.getItemPrice());
	}
	
	public static void displayDate(ChReview employee)
	{
		System.out.printf("%s%1s%1s%1s%1s", employee.getDay(), "/", employee.getMonth(), "/", employee.getYear());
	}
}
