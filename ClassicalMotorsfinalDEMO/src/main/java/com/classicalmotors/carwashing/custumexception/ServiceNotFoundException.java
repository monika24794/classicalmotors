package com.classicalmotors.carwashing.custumexception;

public class ServiceNotFoundException extends RuntimeException {
	
	public ServiceNotFoundException(String msg) {
		super(msg);
		
	}
}
