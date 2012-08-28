package com.springcollections.beans;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Persona {
	private String nombre;
	private int edad;

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		 return ToStringBuilder.reflectionToString(this);
	}
	
}