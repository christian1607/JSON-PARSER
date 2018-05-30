package com.celmam.jsonobject.jsonparser;

import java.util.List;
import java.util.Set;

public class BusinessObject {

	private String name;
	private Set<Property> atributos;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Property> getAtributos() {
		return atributos;
	}

	public void setAtributos(Set<Property> atributos) {
		this.atributos = atributos;
	}

}
