package com.javaexamples.ch4;

import java.util.Scanner;

public class CalculadoraSalario {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double sueldoTotal = 0.0;
		int cont = 1;
		
		while (cont <= 3){
			System.out.printf("%s%s%s%n", "Dame el nombre del empleado no.", cont, " ? : ");
			String empleadoNombre = input.next();
			System.out.printf("%s%s%s%n", "Dame la tarifa del empleado ", empleadoNombre, " ? : ");
			double empleadoTarifa = input.nextDouble();
			System.out.printf("%s%s%s%n", "Dame las horas trabajadas por semana del empleado ", empleadoNombre, " ? : ");
			double empleadoHorasTrabajadas = input.nextDouble();
			
			if (empleadoHorasTrabajadas > 0){
				if (empleadoHorasTrabajadas <= 40)
					sueldoTotal = empleadoHorasTrabajadas * empleadoTarifa;
				else{
					double empleadoHorasExtras = empleadoHorasTrabajadas - 40;
					sueldoTotal = (40 * empleadoTarifa) + (empleadoHorasExtras * empleadoTarifa); 
				}
			}
			System.out.printf("%n%s%s%s%s%n", "El Sueldo Total del empleado ", empleadoNombre, " es : $", sueldoTotal);
			cont++;
		}
		input.close();
	}
}
