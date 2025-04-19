/**
 * 
 *  @see : Program that receives a number from user and separates the number in spaced digits
 *  @author : Carlos Q.
 *  @serial : Exercises : SeparateDigits.java
 *
 */

package com.javaexamples.ch2;

import java.util.Scanner;

public class SeparateDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Provide a number with a maximum of 5 digits to separate its units : ");
		int num = input.nextInt();
		
		input.close();
		
		int mmillar = num / 10000;
		int r_mmillar = num % 10000;
		int millar = r_mmillar / 1000;
		int r_millar = r_mmillar % 1000;
		int centenar = r_millar / 100;
		int r_centenar = r_millar % 100;
		int decena = r_centenar / 10;
		int r_decena = r_centenar % 10;
		int unidad = r_decena;
		
		System.out.printf("%s%d%n", "mmillar : ", mmillar);
		System.out.printf("%s%d%n", "millar : ", millar);
		System.out.printf("%s%d%n", "centenar : ", centenar);
		System.out.printf("%s%d%n", "decena : ", decena);
		System.out.printf("%s%d%n", "unidad : ", unidad);
		
		System.out.printf("%s%3s%3s%3s%3s", mmillar, millar, centenar, decena, unidad);
	}
}
