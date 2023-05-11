package com.goltaraya.siscc.services.exceptions;

public class ElementNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ElementNotFoundException(Object id) {
		super("Element not found. ID: " + id);
	}
}
