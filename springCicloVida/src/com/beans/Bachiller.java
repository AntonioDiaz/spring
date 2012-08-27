package com.beans;

public class Bachiller implements Estudiante {

	public Bachiller(){
		System.out.println("llama al constructor Bachiller");
	}
	
	@Override
	public int presentaExamen() {
		 return (int) (Math.random() * 100.0);
	}
}
