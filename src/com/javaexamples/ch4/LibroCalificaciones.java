package com.javaexamples.ch4;

import java.util.Scanner;

public class LibroCalificaciones {
	
	private String nombreDelCurso;
	
	public LibroCalificaciones(String nombreDelCurso){
		this.nombreDelCurso = nombreDelCurso;
	}
	
	public void setNombreDelCurso(String nombreDelCurso){
		this.nombreDelCurso = nombreDelCurso;
	}
	
	public String getNombreDelCurso(){
		return nombreDelCurso;
	}
	
	public void mostrarMensaje(){
		
		System.out.printf("%s%s%n", "Bienvenido al Curso", getNombreDelCurso());
	}

	public void calcularPromedioClase(){
		Scanner input = new Scanner(System.in);
		int contador = 0;  // Inicializado a cero pues no se sabe las veces de incremento, por centinela.
		int total = 0;
		
		System.out.printf("%s%s%s%s%s%n", "Dame la calificaion del alumno no. ", contador + 1, " de la clase ", getNombreDelCurso(), ". Para terminar: -1");
		int calificacion = input.nextInt();
	
		while (calificacion != -1){
			total = total + calificacion;
			contador ++;
			System.out.printf("%s%s%s%s%s%n", "Dame la calificaion del alumno no. ", contador + 1, " de la clase ", getNombreDelCurso(), ". Para terminar: -1");
			calificacion = input.nextInt();
		}
		
		input.close();
		
		if (contador > 0){
			double promedio = (double) total / contador ;
			System.out.printf("%s%s%s%s%n", "El promedio total de calificaciones de ",(int) contador, " alumnos es ", promedio);
		} else {
			System.out.printf("%s%n", "Ningun alumno con calificacion a inroducir!");
		}
	}
}
