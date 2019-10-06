package com.javaexamples.ch3;

public class Empleado{
	private String nombre;
	private String apellido;
	private double salario;
	private int day;
	private int month;
	private int year;
	
	public Empleado(String nombre, String apellido, double salario, int day, int month, int year){
		if (nombre instanceof String)
			this.nombre = nombre;
		
		if (apellido instanceof String)
			this.apellido = apellido;
		
		if (salario == (double)salario)  // If string value is being passed , use Integer.parseInt(string_var)
			this.salario = salario;
		
		if (day > 1 && day <31)
			this.day = day;
		
		if (month > 1 && month < 12)
			this.month = month;
		
		if (year > 1945 && year < 2020)
			this.year = year;
	}

	public void setNombre(String nombre){
		if (nombre instanceof String)
			this.nombre = nombre;
	}
	
	public void setApellido(String apellido){
		if (apellido instanceof String)
			this.apellido = apellido;
	}
	
	public void setSalario(double salario){
		if (salario == (double)salario)
			this.salario = salario;
	}
	
	public void setday(int day){
		if (day > 1 && day <31)
			this.day = day;
	}
	
	public void setMonth(int month){
		if (month > 1 && month < 12)
			this.month = month;
	}
	
	public void setYear(int year){
		if (year > 1945 && year < 2020)
			this.year = year;
	}
	
	public String getNombre(){
		return(nombre);
	}
	
	public String getApellido(){
		return(apellido);
	}
	
	public double getSalario(){
		return(salario);
	}
	
	public int getDay(){
		return(day);
	}
	
	public int getMonth(){
		return(month);
	}
	
	public int getYear(){
		return(year);
	}
	
	public void printEmpleado(String nombre, String apellido, double salario, int day, int month, int year){
		System.out.printf("%nEmpleado: %s %s", nombre, apellido);
		System.out.printf("%nSalario mensual: $%.2f", salario);
		System.out.printf("%nSalario anual: $%.2f", salario*12);
		System.out.printf("%nFecha de nacimiento %s/%s/%s%n", day, month, year);
	}
}

