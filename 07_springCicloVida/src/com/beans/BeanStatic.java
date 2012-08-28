package com.beans; 

public class BeanStatic {
	private static BeanStatic instancia;

	static {
		instancia = new BeanStatic();
	}

	private BeanStatic() {
	}

	public static BeanStatic getInstancia() {
		return instancia;
	}

	public String getMensaje() {
		return "Hola a todos los desarrolladores Java";
	}
}