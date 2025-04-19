package com.javaexamples.ch4;

public class LibroCalificacionesPrueba {

	public static void main(String[] args){
		LibroCalificaciones calificacionesProgra = new LibroCalificaciones("Programacion Orientada a Objetos");

		calificacionesProgra.mostrarMensaje();
		calificacionesProgra.calcularPromedioClase();
		
		//LibroCalificaciones calificacionesMate = new LibroCalificaciones("Calculus Vectorialus");
		
		//calificacionesMate.mostrarMensaje();
		//calificacionesMate.calcularPromedioClase();
	}
}
