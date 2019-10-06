package com.javaexamples.ch3;

import java.util.Scanner;

public class EmpleadoTest {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double x = 3000.05;
		int d = 9;
		int m = 12;
		int y = 2014;
		Empleado empleado = new Empleado("Carlitos", "Quiroz", x, d, m, y);
		
		System.out.println("Empleado de Compania CO. Salario inicial");
		System.out.printf("%nEmpleado %s %s tiene un salario de %.2f%n", 
		empleado.getNombre(), empleado.getApellido(), empleado.getSalario());
		empleado.printEmpleado(empleado.getNombre(), empleado.getApellido(), 
				empleado.getSalario(), empleado.getDay(), empleado.getMonth(), empleado.getYear());
		
		System.out.println("\nQue aumento de salario quieres aplicar?: ");
		double num = input.nextDouble();
		input.close();
		
		System.out.println("Despues de aplicar aumento y actualizaciones sobre el nombre");
		empleado.setNombre("cArLiToS Eddy");
		empleado.setApellido("Quiroz Zhang");
		empleado.setSalario(x*num);
		empleado.setday(6);
		empleado.setMonth(3);
		empleado.setYear(2017);
		empleado.printEmpleado(empleado.getNombre(), empleado.getApellido(), empleado.getSalario(),
				empleado.getDay(), empleado.getMonth(), empleado.getYear());
		
	}
	
}
