package com.classicalmotors.carwashing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicalmotors.carwashing.custumexception.NotificationNotFoundException;
import com.classicalmotors.carwashing.custumexception.UserNotFoundException;
import com.classicalmotors.carwashing.dao.NotificationRepo;
import com.classicalmotors.carwashing.entity.Notification;


@Service
public class NotificationService implements CurdService<Notification, Integer> {
	
	
	@Autowired
	private NotificationRepo notificationRepo;

	@Override
	public Notification create(Notification t) {
	
		return notificationRepo.save(t);
	}

	@Override
	public List<Notification> fetchAll() {
		
		return notificationRepo.findAll();
	}

	@Override
	public Notification fetchById(Integer k) {
		
		return notificationRepo.findById(k).orElseThrow(() -> new NotificationNotFoundException("Invalid id"));
	}

	@Override
	public Notification update(Notification t1, Notification t2) {
		t2.setCreatedAt(t1.getCreatedAt());
		t2.setMessage(t1.getMessage());
		return notificationRepo.save(t2);
	}

	@Override
	public String delete(Notification t) {
		notificationRepo.delete(t);
		return t.getId() + "   Deletead";
	}

}
