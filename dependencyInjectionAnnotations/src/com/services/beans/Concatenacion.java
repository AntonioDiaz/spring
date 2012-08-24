package com.services.beans;

import org.springframework.stereotype.Service;

@Service (value="concatenacion")
public class Concatenacion implements Proceso {

	@Override
	public Object ejecuta() {
		 return new StringBuilder().append("Hola ").append(" mundo");
	}
}
