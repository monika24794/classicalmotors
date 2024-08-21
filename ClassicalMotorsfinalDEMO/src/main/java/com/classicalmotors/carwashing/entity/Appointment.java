package com.classicalmotors.carwashing.entity;

import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Table;


@Entity
@Table(name = "Appointment_table")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String status;
	private Date date;
	private Time time;
	@ManyToOne
	@JoinColumn(name = "userid")
	private Users users;
	@ManyToOne
	@JoinColumn(name = "serviceid")
	private Services services;

	@OneToMany(mappedBy = "appointment", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Histroy> historiesHistroys = new ArrayList<>();

	public Appointment() {
		super();
	}

	public Appointment(int id, String status, Date date, Time time, Users users, Services services) {
		super();
		this.id = id;
		this.status = status;
		this.date = date;
		this.time = time;
		this.users = users;
		this.services = services;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Services getServices() {
		return services;
	}

	public void setServices(Services services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", status=" + status + ", date=" + date + ", time=" + time + ", users=" + users
				+ ", services=" + services + "]";
	}

}
