package com.services;

import com.Proceso;

public class ServicioRemoto {
	private Proceso proceso;
	private Integer repeticiones;

	public ServicioRemoto() {
	}

	public ServicioRemoto(Proceso proceso) {
		this.proceso = proceso;
	}

	public Object consultaDato() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < repeticiones; i++) {
			stringBuilder.append(i + 1).append(" ").append(proceso.ejecuta()).append("\n");
		}
		return stringBuilder.toString();
	}

	public Integer getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(Integer repeticiones) {
		this.repeticiones = repeticiones;
	}
}