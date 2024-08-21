package com.classicalmotors.carwashing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classicalmotors.carwashing.entity.Services;
import com.classicalmotors.carwashing.entity.Users;

public  interface ServiceRepo extends JpaRepository<Services, Integer> {
	Services findByserviceName(String serviceName);
}
