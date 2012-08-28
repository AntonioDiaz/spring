package com.beans;

public class EstudianteDoctorado implements Estudiante {

	@Override
	public int presentaExamen() {
		return 0;
	}

	public void inicializa() {
		System.out.println("Realizando inicializacion de rutina en el bean.");
	}

	public void destruye() {
		System.out.println("Realizando destruccion de rutina en el bean.");
	}

}
