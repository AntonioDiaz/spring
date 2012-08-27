package com.beans; 

public class BeanFactory {
	private static BeanFactory instancia;

	static {
		instancia = new BeanFactory();
	}

	private BeanFactory() {
	}

	public static BeanFactory getInstancia() {
		return instancia;
	}

	public String getMensaje() {
		return "Hola a todos los desarrolladores Java";
	}
}