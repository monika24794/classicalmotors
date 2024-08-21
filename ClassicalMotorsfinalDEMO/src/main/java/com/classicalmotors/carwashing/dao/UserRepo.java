package com.classicalmotors.carwashing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classicalmotors.carwashing.entity.Users;

public interface UserRepo extends JpaRepository<Users, Integer> {

	Users findByuserName(String userName);
}
