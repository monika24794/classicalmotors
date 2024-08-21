package com.classicalmotors.carwashing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicalmotors.carwashing.custumexception.UserNotFoundException;
import com.classicalmotors.carwashing.dao.AppointmentRepo;

import com.classicalmotors.carwashing.entity.Appointment;

@Service
public class AppointmentServices implements CurdService<Appointment, Integer> {

	@Autowired
	private AppointmentRepo appointmentRepo;

	@Override
	public Appointment create(Appointment app) {

		return appointmentRepo.save(app);
	}

	@Override
	public List<Appointment> fetchAll() {

		return appointmentRepo.findAll();
	}

	@Override
	public Appointment fetchById(Integer id) {

		return appointmentRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Invalid id"));
	}

	@Override
	public Appointment update(Appointment t1, Appointment t2) {
		t2.setStatus(t1.getStatus());
		return appointmentRepo.save(t2);

	}

	@Override
	public String delete(Appointment t) {
		appointmentRepo.delete(t);
		return t.getId() + "    deletead .";

	}
	public Appointment fetchAppointmentByStatus( String status) {
		return appointmentRepo.findByStatus(status);
		
	}

}
