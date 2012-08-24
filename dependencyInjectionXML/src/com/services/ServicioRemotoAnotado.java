package com.services;

import com.Proceso;

public class ServicioRemotoAnotado {
	private Proceso proceso;

	public ServicioRemotoAnotado() {
	}

	public ServicioRemotoAnotado(Proceso proceso) {
		this.proceso = proceso;
	}

	public Object consultaDato() {
		return proceso.ejecuta();
	}
}