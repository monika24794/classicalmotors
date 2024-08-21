package com.classicalmotors.carwashing.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.classicalmotors.carwashing.dto.ErrorResponce;
import com.classicalmotors.carwashing.entity.Histroy;
import com.classicalmotors.carwashing.entity.Users;
import com.classicalmotors.carwashing.service.HistroyService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/history")
public class HistroyController {

    @Autowired
    private HistroyService histroyService;
    @PostMapping("/add")
	public ResponseEntity<?> registerdUser(@RequestBody Histroy histroy ) {
    	Histroy createdUser = histroyService.create(histroy);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAllUserser() {
		try {
			return new ResponseEntity<>(histroyService.fetchAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>
			(new ErrorResponce("User Feacthing is failead", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}

	}
	@GetMapping("/getuser/{userId}")
	public ResponseEntity<?> getUserById(@PathVariable("userId") Integer id) {
		try {
			return  ResponseEntity.ok(histroyService.fetchById(id));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce=
		    new ErrorResponce("User Feacthing is failead", e.getMessage());
			return new ResponseEntity<>
			(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{userId}")
	public ResponseEntity<?> updateuserById(@PathVariable("userId") Integer id,
			@RequestBody Histroy updateUser) {
		try {
			Histroy existingUser=histroyService.fetchById(id);
			
			return  ResponseEntity.ok(histroyService.update(updateUser, existingUser));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce= new ErrorResponce("User updation is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<?>deleteUserById(@PathVariable ("userId") Integer id)
	{ try {
		Histroy existingUser=histroyService.fetchById(id);
		return ResponseEntity.ok(histroyService.delete(existingUser));
				
	} catch (Exception e) {

		ErrorResponce errorResponce= new ErrorResponce("User deletion is failead", e.getMessage());
		return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		
	}
		
	}
}
