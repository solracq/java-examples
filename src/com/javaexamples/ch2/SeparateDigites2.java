package com.javaexamples.ch2;

import java.util.Scanner;

public class SeparateDigites2 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me an integer number and I will separte it in spaces: ");
		int num = input.nextInt();
		input.close();
		
		int length = (int) Math.log10(num) + 1;
		
		int resultado = 0;
		int residuo = 0;
		int[] arrayB = new int[length-1];
		
		if (length == 1)
			System.out.printf("%n %s %n", num);
		else if (length == 2) {
			resultado = num / 10;
			residuo = num % 10;
			System.out.printf("%n %s %s %n", resultado, residuo);
		} else if (length > 2) {
			resultado = num / 10;
			residuo = num % 10;
			int res = residuo;

			for(int i = 0 ; i < length-1 ; i++){
				residuo = resultado % 10;
				resultado = resultado /10;
				arrayB[i] = residuo;
			}
			System.out.println();
			for (int i = 0; i < length-1 ; i++)
				System.out.printf("%s ", arrayB[(length-2)-i]);
			System.out.printf("%s", res);
		}
		
	}
}
