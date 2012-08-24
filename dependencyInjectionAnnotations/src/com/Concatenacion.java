package com;

import org.springframework.stereotype.Service;

@Service
public class Concatenacion implements Proceso {

	@Override
	public Object ejecuta() {
		 return new StringBuilder().append("Hola ").append(" mundo");
	}
}
