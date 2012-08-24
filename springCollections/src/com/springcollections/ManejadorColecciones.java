package com.springcollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.springcollections.beans.Persona;

public class ManejadorColecciones {
	
	private List<Persona> lista;
	private Persona[] arreglo;
	private Set<Persona> conjunto;
	private Map<Persona, Object> mapa;
	private Properties propiedades;
	
	public List<Persona> getLista() {
		return lista;
	}
	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}
	public Persona[] getArreglo() {
		return arreglo;
	}
	public void setArreglo(Persona[] arreglo) {
		this.arreglo = arreglo;
	}
	public Set<Persona> getConjunto() {
		return conjunto;
	}
	public void setConjunto(Set<Persona> conjunto) {
		this.conjunto = conjunto;
	}
	public Map<Persona, Object> getMapa() {
		return mapa;
	}
	public void setMapa(Map<Persona, Object> mapa) {
		this.mapa = mapa;
	}
	public Properties getPropiedades() {
		return propiedades;
	}
	public void setPropiedades(Properties propiedades) {
		this.propiedades = propiedades;
	}
	
	@Override
	public String toString() {
		 return ToStringBuilder.reflectionToString(this);
	}	
}