package com.javaexamples.ch2;

import java.util.Scanner;

public class PopulationGrowthCalculator {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		long worldPopulation = 7702797900L;
		double annualGrowth = 1.011;
		
		System.out.println("The world population this yeas is : "+ worldPopulation);
		System.out.printf("%nGive me the number of years to calculae the increased population: %n");
		int num = input.nextInt();
		input.close();
		System.out.printf("%nThe world population will grow in %s years this amount : %s %n", num, worldPopulation*annualGrowth*num);
	}
}
