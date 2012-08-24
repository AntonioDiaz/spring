package com;

import org.springframework.stereotype.Service;

@Service
public class Calculo implements Proceso {

	@Override
	public Object ejecuta() {
		return (int) (Math.random() * 100.0);
	}

}
