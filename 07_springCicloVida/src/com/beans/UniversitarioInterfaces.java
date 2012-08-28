package com.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UniversitarioInterfaces implements Estudiante, InitializingBean, DisposableBean {

	public UniversitarioInterfaces() {
		System.out.println("llama al constructor de Universitario intefaces");
	}
	
	@Override
	public int presentaExamen() {
		 return (int) (Math.random() * 10.0);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bienvenido universitario a tu nuevo segundo hogar.");		
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Vuela libre con tus alas");
	}
}
