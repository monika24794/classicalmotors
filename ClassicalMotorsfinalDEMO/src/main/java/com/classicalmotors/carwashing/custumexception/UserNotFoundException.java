package com.classicalmotors.carwashing.custumexception;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String msg) {
		super(msg);
		
	}
}

