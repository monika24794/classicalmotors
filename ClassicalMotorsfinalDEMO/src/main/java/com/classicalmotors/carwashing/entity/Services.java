package com.classicalmotors.carwashing.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = " Services_table")
public class Services {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String serviceName;
	private float price;

	 @OneToMany(mappedBy = "services",cascade = CascadeType.ALL)
	 @JsonIgnore
	 private List<Appointment> Appointment = new ArrayList<>();

	 @OneToMany(mappedBy = "services",cascade = CascadeType.ALL)
	 @JsonIgnore
	 private List<Histroy> histroy = new ArrayList<>();
	 
	public Services() {
		super();
	}

	public Services(int id, String serviceName, float price) {
		super();
		this.id = id;
		this.serviceName = serviceName;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Services [id=" + id + ", serviceName=" + serviceName + ", price=" + price + "]";
	}

}
