package com.classicalmotors.carwashing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classicalmotors.carwashing.entity.Appointment;


public interface AppointmentRepo extends JpaRepository<Appointment, Integer> 
{
Appointment findByStatus(String status);
}
