package com.services.beans;

import org.springframework.stereotype.Service;

@Service (value="calculo")
public class Calculo implements Proceso {

	@Override
	public Object ejecuta() {
		return (int) (Math.random() * 100.0);
	}

}
