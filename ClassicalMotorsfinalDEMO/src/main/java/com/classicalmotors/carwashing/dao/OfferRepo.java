package com.classicalmotors.carwashing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classicalmotors.carwashing.entity.Offer;



public interface OfferRepo extends JpaRepository<Offer, Integer> {
	Offer findByname(String name);
	
}
