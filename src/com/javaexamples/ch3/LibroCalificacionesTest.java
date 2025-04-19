package com.javaexamples.ch3;

import java.util.Scanner;

public class LibroCalificacionesTest {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		LibroCalificaciones libCal = new LibroCalificaciones("Electromagnetismo", "Mrs. Adam");
		
		System.out.println("\nInitial value of the subject: " + libCal.getNombreCurso());
		System.out.println("\nInitial value of the professor: " + libCal.getProfessor());
		
		System.out.println("\nGive me the name of the subject? : ");
		String subject = input.nextLine();
		System.out.println("\nGive me the name of the professor? : ");
		String professor = input.nextLine();
		input.close();
		
		libCal.setNombreCurso(subject);
		libCal.setProfessor(professor);
		
		System.out.println("\nValue of the subject and professor after set subject: \n");
		libCal.printCurso();
	}
}
