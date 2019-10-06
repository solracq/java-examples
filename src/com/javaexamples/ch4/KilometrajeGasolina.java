/**
 * 
 *  @see : Obtaining user input from a dialog
 *  @author : Carlos Quiroz
 *  @since : October 5th 2015
 *  @serial : 3.13 : NameDialog.java
 * 
 */

package com.javaexamples.ch4;

import java.util.Scanner;

public class KilometrajeGasolina {

	public static void main(String [] args){
	
		Scanner input = new Scanner(System.in);
		
		double kLpTi = 0;
		int count = 0;
		double[] gasolinera = new double[20];
		
		System.out.printf("%n%s%s%s%n", "Dame el kilometraje recorido hasta ahora en la gasolinera no.", count+1, ". Para parar presionar -1");
		int kilometros = input.nextInt();
		System.out.printf("%n%s%s%s%n", "Dame los litros recoridos hasta ahora en la gasolinera no.", count+1, ". Para parar presionar -1");
		int litros = input.nextInt();
		System.out.printf("%s%s%n", "El kilometraje por litro introducido es : ", litros > 0 ? (double) kilometros/litros : "NO PUEDO DIVIDIR ENTRE CERO LITROS");
		
		while (kilometros != -1 || litros != -1){
			kLpTi = kLpTi + (double) (kilometros/litros);
			gasolinera [count] = kLpTi;
			++count;
			System.out.printf("%n%s%s%s%n", "Dame el kilometraje recorido hasta ahora en la gasolinera no.", count+1, ". Para parar presionar -1");
			kilometros = input.nextInt();
			System.out.printf("%n%s%s%s%n", "Dame los litros recoridos hasta ahora en la gasolinera no.", count+1, ". Para parar presionar -1");
			litros = input.nextInt();
			System.out.printf("%s%s%n", "El kilometraje por litro introducido es : ", litros > 0 ? (double) kilometros/litros : "NO PUEDO DIVIDIR ENTRE CERO LITROS");
		}
		
		input.close();
		
		System.out.printf("%n%s%s%s%n", "Los Kilometros por Litros total gastados por viaje de ida es : ", kLpTi, " km/lt");
		System.out.printf("%n%s%s%s%n", "Los Kilometros por Litros total gastados por viaje de ida y regreso es : ", 2*kLpTi, " km/lt");
		for(int i=0 ; i <= count ; i++){
			System.out.printf("%s%s%s%s%n", (double) gasolinera[i] ,"km/lt", " gastados en total hasta la gasolinera no.", i+1);
		}
		System.out.printf("%n%s%s%.2s%n", "El promedio de km/lt gastados de ida en todas las gasolineras fue de ", (double) kLpTi/count, "km/lt");
		System.out.printf("%n%s%s%.2s%n", "El promedio de km/lt gastados de ida y regreso en todas las gasolineras fue de ", (double) 2*kLpTi/count, "km/lt");
	}
	
}
