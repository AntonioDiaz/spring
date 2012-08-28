package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.services.beans.Proceso;

@Service(value = "servicioRemoto")
public class ServicioRemotoAnotado {
	private Proceso proceso;
	//@Value(value = "5")
	private Integer repeticiones;

	public ServicioRemotoAnotado() {
	}

	@Autowired
	public ServicioRemotoAnotado(@Qualifier("calculo") Proceso proceso) {
		this.proceso = proceso;
	}

	public Object consultaDato() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < repeticiones; i++) {
			stringBuilder.append(i + 1).append(" - ").append(proceso.ejecuta()).append("\n");
		}
		return stringBuilder.toString();
	}

	public Integer getRepeticiones() {
		return repeticiones;
	}
	
	@Value(value = "3")
	public void setRepeticiones(Integer repeticiones) {
		this.repeticiones = repeticiones;
	}
}