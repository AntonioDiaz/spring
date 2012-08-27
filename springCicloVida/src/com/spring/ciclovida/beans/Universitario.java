package com.spring.ciclovida.beans;

public class Universitario implements Estudiante {

	@Override
	public int presentaExamen() {
		 return (int) (Math.random() * 10.0);
	}
}
