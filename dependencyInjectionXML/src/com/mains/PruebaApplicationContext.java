package com.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.services.ServicioRemoto;


public class PruebaApplicationContext {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ServicioRemoto servicio = applicationContext.getBean("servicioRemoto", ServicioRemoto.class);
		System.out.println("El valor es: " + servicio.consultaDato());
	}
}
