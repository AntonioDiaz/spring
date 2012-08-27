package com.beans;

public class Universitario implements Estudiante {

	public Universitario(){
		System.out.println("llama al constructor...");
	}
	
	@Override
	public int presentaExamen() {
		 return (int) (Math.random() * 10.0);
	}
}
