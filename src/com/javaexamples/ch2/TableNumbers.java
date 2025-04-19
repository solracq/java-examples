package com.javaexamples.ch2;

import java.util.Scanner;

public class TableNumbers {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Table of sqare and cube Numbers");
		System.out.println("\nGive me the number of iterations: ");
		int num =  input.nextInt();
		input.close();
		
		System.out.printf("%nNumber \t\t Square \t Cube %n");
		
		for(int i=0; i <= num ; i++)
			System.out.printf("%n%s \t\t %s \t\t %s %n", i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
	}
}
