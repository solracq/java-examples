package com.javaexamples.ch3;

public class LibroCalificaciones {
	private String nombreCurso;
	private String professor;
	
	public LibroCalificaciones(String nombreC, String professor) {
		nombreCurso = nombreC;
		this.professor = professor;
	}
	
	public void setNombreCurso(String nombre){
		nombreCurso = nombre;
	}
	
	public void setProfessor(String professor){
		this.professor = professor;
	}
	
	public String getNombreCurso(){
		return nombreCurso;
	}
	
	public String getProfessor(){
		return professor;
	}
	
	public void printCurso(){
		System.out.println("Bienvenido al curso de calificadiones para " + getNombreCurso()+" con el profesor "+ getProfessor());
	}
}
