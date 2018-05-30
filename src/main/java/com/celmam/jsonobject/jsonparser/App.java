package com.celmam.jsonobject.jsonparser;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		BusinessObject businessObject = new BusinessObject();

		businessObject.setName("persona");
		Set<Property> atributos = new HashSet<>();

		Property prop1 = new Property();
		prop1.setName("nombre");
		prop1.setValue("Christian");

		Property prop2 = new Property();
		prop2.setName("apellido");
		prop2.setValue("Altamirano Ayala");

		Property prop3 = new Property();
		prop3.setName("Edad");
		prop3.setValue("24");

		Property prop4 = new Property();
		prop4.setName("FechaNacimiento");
		prop4.setValue("16/07/1993");

		atributos.add(prop1);
		atributos.add(prop2);
		atributos.add(prop3);
		atributos.add(prop4);

		businessObject.setAtributos(atributos);

		JSONObject jsonObject = new JSONObject();
		JSONArray attributes = new JSONArray();

		for (Property properti : businessObject.getAtributos()) {
			JSONObject attr = new JSONObject();
			attr.put(properti.getName(), properti.getValue());
			attributes.put(attr);

		}

		jsonObject.put(businessObject.getName(), attributes);
		
		System.out.println(jsonObject.toString());

	}
}
