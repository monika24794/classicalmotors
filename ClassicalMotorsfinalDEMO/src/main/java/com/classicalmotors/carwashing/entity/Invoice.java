package com.classicalmotors.carwashing.entity;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = " invoice_table")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    private String number;

    private String status;
    
    private double totalAmount;
    
    private Date issued;
//  @OneToMany(mappedBy = "invoice")
//  private List<Appointment> appointments;

	public Invoice() {
		super();
	}
public Invoice(int id, String number, String status, double totalAmount, Date issued) {
	super();
	this.id = id;
	this.number = number;
	this.status = status;
	this.totalAmount = totalAmount;
	this.issued = issued;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
public Date getIssued() {
	return issued;
}
public void setIssued(Date issued) {
	this.issued = issued;
}
@Override
public String toString() {
	return "Invoice [id=" + id + ", number=" + number + ", status=" + status + ", totalAmount=" + totalAmount
			+ ", issued=" + issued + "]";
}


    
}

