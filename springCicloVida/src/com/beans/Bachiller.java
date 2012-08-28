package com.beans;

public class Bachiller implements Estudiante {

	public Bachiller() {
		System.out.println("llama al constructor Bachiller");
	}

	@Override
	public int presentaExamen() {
		return (int) (Math.random() * 100.0);
	}

	public void preparaEstudiante() {
		System.out.println("Preparando al nuevo estudiante para entrar en la Instituto.");
	}

	public void despideEstudiante() {
		System.out.println("Finalmente podemos decir adios a este estudiante.");
	}
}
