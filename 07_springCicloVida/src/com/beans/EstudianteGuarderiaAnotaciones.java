package com.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

@Service(value = "estudianteGuarderia")
public class EstudianteGuarderiaAnotaciones implements Estudiante {

	@Override
	public int presentaExamen() {
		return 0;
	}

	@PostConstruct
	public void inicializa() {
		System.out.println("Realizando inicializacion de rutina en el bean.");
	}

	@PreDestroy
	public void destruye() {
		System.out.println("Realizando destruccion de rutina en el bean.");
	}
}
