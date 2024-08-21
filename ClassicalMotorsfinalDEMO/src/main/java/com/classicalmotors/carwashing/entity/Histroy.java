package com.classicalmotors.carwashing.entity;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Histroy_table")
public class Histroy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date date;
	private String notes;
	private int rateing;
	private String status;
	
	@ManyToOne
    @JoinColumn(name = "appointment_id") // Foreign key column
    private Appointment appointment;
	
	@ManyToOne
	@JoinColumn(name = "serviceid")
	private Services services;
	
	
	
	public Histroy() {
		super();
	}
	public Histroy(int id, Date date, String notes, int rateing, String status, Appointment appointment) {
		super();
		this.id = id;
		this.date = date;
		this.notes = notes;
		this.rateing = rateing;
		this.status = status;
		this.appointment = appointment;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getRateing() {
		return rateing;
	}
	public void setRateing(int rateing) {
		this.rateing = rateing;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Appointment getAppointment() {
		return appointment;
	}
	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	@Override
	public String toString() {
		return "Histroy [id=" + id + ", date=" + date + ", notes=" + notes + ", rateing=" + rateing + ", status="
				+ status + ", appointment=" + appointment + "]";
	}

	
	

}
