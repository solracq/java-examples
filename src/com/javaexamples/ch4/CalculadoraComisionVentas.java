package com.javaexamples.ch4;

import java.util.Scanner;

public class CalculadoraComisionVentas {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double articulo1 = 239.99;
		double articulo2 = 129.75;
		double articulo3 = 99.95;
		double articulo4 = 350.83;
		double salarioNeto = 200.00;
		double totalArticulos = 0;
		
		System.out.printf("%s%n", "Dame el nombre del vendedor :");
		String vendedor = input.next();
		System.out.printf("%s%n%s%25s%25s%25s%n", "Articulos Disponibles :", "Articulo 1 = $239.99", "Articulo 2 = $129.75", "Articulo 3 = $99.95", "Articulo 4 = $350.83");
		System.out.printf("%n%s%s%s%n", "Dame el articulo (1 a 4) vendido por ", vendedor, " en esta semana (-1 para salir) : ");
		int articulo = input.nextInt();
		
		while (articulo != -1){
			if (articulo == 1)
				totalArticulos += articulo1;
			else if (articulo == 2)
				totalArticulos += articulo2;
			else if (articulo == 3)
				totalArticulos += articulo3;
			else if (articulo == 4)
				totalArticulos += articulo4;
			else
				System.out.println(">>>> Error #897: Este articulo no existe! <<<<");
			
			System.out.printf("%n%s%s%s%n", "Otros articulos vendido por ", vendedor, " en esta semana (-1 para salir) : ");
			articulo = input.nextInt();
		}
		input.close();
		
		double salarioTotal = salarioNeto + (totalArticulos * 0.09);
		System.out.printf("%n%s%s%n", "Total de articulos vendidos : ", totalArticulos);
		System.out.printf("%n%s%s%s%.2f%n", "El salario semanal mas bonos del vendedor ", vendedor," es : $", salarioTotal);
	}

}
