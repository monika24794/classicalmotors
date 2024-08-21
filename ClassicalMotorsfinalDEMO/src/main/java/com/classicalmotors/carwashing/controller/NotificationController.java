package com.classicalmotors.carwashing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classicalmotors.carwashing.dto.ErrorResponce;
import com.classicalmotors.carwashing.entity.Notification;
import com.classicalmotors.carwashing.entity.Offer;
import com.classicalmotors.carwashing.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {
	@Autowired
	private NotificationService notificationService;
	@PostMapping("/add")
	public ResponseEntity<?> registerdNotification(@RequestBody Notification notification  ) {
		Notification  createdNotification = notificationService.create(notification);
		return new ResponseEntity<>(createdNotification, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllNotification() {
		try {
			return new ResponseEntity<>(notificationService.fetchAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>
			(new ErrorResponce("Notification Feacthing is failead", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}

	}
	@GetMapping("/getoffer/{notificationId}")
	public ResponseEntity<?> getNotificationById(@PathVariable("notificationId") Integer id) {
		try {
			return  ResponseEntity.ok(notificationService.fetchById(id));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce=
		    new ErrorResponce("Notification Feacthing is failead", e.getMessage());
			return new ResponseEntity<>
			(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{notificationId}")
	public ResponseEntity<?> updateNotificationById(@PathVariable("notificationId") Integer id,
			@RequestBody Notification updateNotification) {
		try {
			Notification existingNotification=notificationService.fetchById(id);
			
			return  ResponseEntity.ok(notificationService.update(updateNotification, existingNotification));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce= new ErrorResponce("Notification updation is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("/delete/{notificationId}")
	public ResponseEntity<?>deleteNotificationById(@PathVariable ("notificationId") Integer id)
	{ try {
		Notification existingnotification=notificationService.fetchById(id);
		return ResponseEntity.ok(notificationService.delete(existingnotification));
				
	} catch (Exception e) {

		ErrorResponce errorResponce= new ErrorResponce("Notification deletion is failead", e.getMessage());
		return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		
	}
}
}
