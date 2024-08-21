package com.classicalmotors.carwashing.custumexception;

public class InvoiceNotFoundException extends RuntimeException {

	public InvoiceNotFoundException(String msg) {
		super(msg);
		
	}
}
