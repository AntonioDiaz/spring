package com;

public class Calculo implements Proceso {

	@Override
	public Object ejecuta() {
		return (int) (Math.random() * 100.0);
	}

}
