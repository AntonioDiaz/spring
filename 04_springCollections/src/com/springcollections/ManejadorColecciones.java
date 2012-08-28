package com.springcollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.springcollections.beans.Persona;

public class ManejadorColecciones {
	
	private List<Persona> myList;
	private Persona[] myArray;
	private Set<Persona> mySet;
	private Map<String, Persona> myMap;
	private Properties myProperties;
	
	public List<Persona> getMyList() {
		return myList;
	}

	public void setMyList(List<Persona> myList) {
		this.myList = myList;
	}

	public Persona[] getMyArray() {
		return myArray;
	}

	public void setMyArray(Persona[] myArray) {
		this.myArray = myArray;
	}

	public Set<Persona> getMySet() {
		return mySet;
	}

	public void setMySet(Set<Persona> mySet) {
		this.mySet = mySet;
	}

	public Map<String, Persona> getMyMap() {
		return myMap;
	}

	public void setMyMap(Map<String, Persona> myMap) {
		this.myMap = myMap;
	}

	public Properties getMyProperties() {
		return myProperties;
	}

	public void setMyProperties(Properties myProperties) {
		this.myProperties = myProperties;
	}

	@Override
	public String toString() {
		 return ToStringBuilder.reflectionToString(this);
	}	
}