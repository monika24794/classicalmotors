package com.classicalmotors.carwashing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="vehical_table")
public class Vehical 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "userid")
    private Users users;
	private String model;
	private String type;
	private String liecenceplate;
	
	public Vehical() {
		super();
	}

	public Vehical(int id, Users users, String model, String type, String liecenceplate) {
		super();
		this.id = id;
		this.users = users;
		this.model = model;
		this.type = type;
		this.liecenceplate = liecenceplate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLiecenceplate() {
		return liecenceplate;
	}

	public void setLiecenceplate(String liecenceplate) {
		this.liecenceplate = liecenceplate;
	}

	@Override
	public String toString() {
		return "Vehical [id=" + id + ", users=" + users + ", model=" + model + ", type=" + type + ", liecenceplate="
				+ liecenceplate + "]";
	}

	
}