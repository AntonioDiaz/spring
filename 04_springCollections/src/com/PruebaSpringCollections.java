package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcollections.ManejadorColecciones;


public class PruebaSpringCollections {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ManejadorColecciones servicio = applicationContext.getBean("manejador", ManejadorColecciones.class);
		System.out.println("El valor es :" + servicio);
	}
}
