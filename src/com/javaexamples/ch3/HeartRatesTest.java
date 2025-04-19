package com.javaexamples.ch3;

public class HeartRatesTest {
	
	public static void main(String[] args)
	{
		HeartRates heartRates = new HeartRates("Ya", "Z", 3, 10, 1988);
		
		HeartRates heartRates2 = new HeartRates("Cam", "Q", 2, 2, 1998);
		
		HeartRates heartRates3 = new HeartRates("Cal", "Q", 8, 12, 2000);
		
		printResults(heartRates, heartRates.getYear());
		printResults(heartRates2, heartRates2.getYear());
		printResults(heartRates3, heartRates3.getYear());
	}
	
	public static void printResults(HeartRates heart_reates, int age)
	{
		String firstName = heart_reates.getFirstName();
		String lastName = heart_reates.getLastName();
		int personAge = heart_reates.calculatePersonAge(age);
		int heartRate = heart_reates.calculateMaxHeartRate(personAge);
		double targetHeartRate = heart_reates.calculateTargetHeartRate(heartRate);
		
		System.out.printf("%10s%n","=== Calculating Heart Rates ===");
		System.out.printf("%s%20s%20s%20s%n","Client", "Age", "Maximum Heart Rate", "Target Heart Rate");
		System.out.printf("%s%s%s%15s%15s%15.2f%n%n", firstName, " ", lastName, personAge, heartRate, targetHeartRate);
		System.out.println();
	}
}
