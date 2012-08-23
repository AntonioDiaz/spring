package com;

public class Concatenacion implements Proceso {

	@Override
	public Object ejecuta() {
		 return new StringBuilder().append("Hola ").append(" mundo");
	}
}
