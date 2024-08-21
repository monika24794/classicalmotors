package com.classicalmotors.carwashing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classicalmotors.carwashing.entity.Histroy;

public interface HistroyRepo extends JpaRepository<Histroy, Integer> {
	Histroy findBystatus(String status);
}
