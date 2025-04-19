package com.javaexamples.ch4;

public class StudentTest {

	public static void main(String[] args)
	{
		Student student1 = new Student("Col", 95.99);
		Student student2 = new Student("Lars", 98.99);
		Student student3 = new Student("Cloie", 75.50);
		Student student4 = new Student("Leo Pal", 40.50);
		
		printGrade(student1);
		printGrade(student2);
		printGrade(student3);
		printGrade(student4);
	}
	
	public static void printGrade(Student student)
	{
		double average = student.getAverage();
		System.out.printf("%s%s%.2f%s%s%n", student.getName(), "'s letter grade for ", average, " is ", student.getGradeToLetter(average));
		
		System.out.printf("%10s%s%n", student.getName(), student.getAverage() > 60 ? " PASSED" : " FAILED");
	}
}
