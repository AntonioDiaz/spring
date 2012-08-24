package com.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.services.ServicioRemotoAnotado;


public class PruebaApplicationContext {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.services");
		ServicioRemotoAnotado servicio = applicationContext.getBean("servicioRemoto", ServicioRemotoAnotado.class);
		System.out.println("El valor es: " + servicio.consultaDato());
	}
}
