package com.classicalmotors.carwashing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classicalmotors.carwashing.entity.Notification;


public interface NotificationRepo  extends JpaRepository<Notification, Integer> {
	Notification findBytitle(String title);

}
