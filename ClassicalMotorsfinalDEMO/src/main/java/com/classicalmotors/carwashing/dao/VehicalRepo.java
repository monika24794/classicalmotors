package com.classicalmotors.carwashing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classicalmotors.carwashing.entity.Vehical;
public interface VehicalRepo  extends JpaRepository<Vehical, Integer> 
{
	Vehical findByliecenceplate(String liecenceplate);

	

}
