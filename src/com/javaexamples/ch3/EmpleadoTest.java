package com.javaexamples.ch3;

import java.util.Scanner;

public class EmpleadoTest {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double x = 3000.05;
		int d = 20;
		int m = 11;
		int y = 2003;
		Empleado empleado = new Empleado("Car", "K", x, d, m, y);
		
		System.out.println("Empleado de Compania CO. Salario inicial");
		System.out.printf("%nEmpleado %s %s tiene un salario de %.2f%n", 
		empleado.getNombre(), empleado.getApellido(), empleado.getSalario());
		empleado.printEmpleado(empleado.getNombre(), empleado.getApellido(), 
				empleado.getSalario(), empleado.getDay(), empleado.getMonth(), empleado.getYear());
		
		System.out.println("\nQue aumento de salario quieres aplicar?: ");
		double num = input.nextDouble();
		input.close();
		
		System.out.println("Despues de aplicar aumento y actualizaciones sobre el nombre");
		empleado.setNombre("cs Ed");
		empleado.setApellido("K Zj");
		empleado.setSalario(x*num);
		empleado.setday(7);
		empleado.setMonth(9);
		empleado.setYear(2011);
		empleado.printEmpleado(empleado.getNombre(), empleado.getApellido(), empleado.getSalario(),
				empleado.getDay(), empleado.getMonth(), empleado.getYear());
		
	}
	
}
