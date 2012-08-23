package com.services;

import com.Proceso;

public class ServicioRemoto {
	private Proceso proceso;

	public ServicioRemoto() {
	}

	public ServicioRemoto(Proceso proceso) {
		this.proceso = proceso;
	}

	public Object consultaDato() {
		return proceso.ejecuta();
	}
}