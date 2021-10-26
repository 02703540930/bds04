package com.devsuperior.bds04.services.exceptions;

public class ResourceUnauthorizedException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	
	public ResourceUnauthorizedException(String msg) {
		super(msg);
	}

}
