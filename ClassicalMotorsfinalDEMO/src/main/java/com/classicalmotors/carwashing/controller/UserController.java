package com.classicalmotors.carwashing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classicalmotors.carwashing.custumexception.UserNotFoundException;
import com.classicalmotors.carwashing.dto.ErrorResponce;
import com.classicalmotors.carwashing.entity.UserLoginData;
import com.classicalmotors.carwashing.entity.Users;
import com.classicalmotors.carwashing.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserLoginData loginRequest) {
	   System.out.println("Username: " + loginRequest.getUsername());
	   System.out.println("Password: " + loginRequest.getPassword());


	       Users user = userService.fetchUserByUserName(loginRequest.getUsername());
	       
	       System.out.println(user.getUsername());
	       System.out.println(loginRequest.getUsername());
	       
	       if (user!= null) {
	       
	           if (user.getPassword().equals(loginRequest.getPassword())) {
	               return ResponseEntity.ok("Login successful");
	           }
	       }
	       
	       return ResponseEntity.status(401).body("User not found");
	   }
	
	
	
	
	@PostMapping("/add")
	public ResponseEntity<?> registerdUser(@RequestBody Users user) {
		Users createdUser = userService.create(user);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAllUserser() {
		try {
			return new ResponseEntity<>(userService.fetchAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>
			(new ErrorResponce("User Feacthing is failead", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}

	}
	@GetMapping("/getuser/{userId}")
	public ResponseEntity<?> getUserById(@PathVariable("userId") Integer id) {
		try {
			return  ResponseEntity.ok(userService.fetchById(id));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce=
		    new ErrorResponce("User Feacthing is failead", e.getMessage());
			return new ResponseEntity<>
			(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{userId}")
	public ResponseEntity<?> updateuserById(@PathVariable("userId") Integer id,
			@RequestBody Users updateUser) {
		try {
			Users existingUser=userService.fetchById(id);
			
			return  ResponseEntity.ok(userService.update(updateUser, existingUser));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce= new ErrorResponce("User updation is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<?>deleteUserById(@PathVariable ("userId") Integer id)
	{ try {
		Users existingUser=userService.fetchById(id);
		return ResponseEntity.ok(userService.delete(existingUser));
				
	} catch (Exception e) {

		ErrorResponce errorResponce= new ErrorResponce("User deletion is failead", e.getMessage());
		return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		
	}
		
	}
	@GetMapping("/getbyuserName/{name}")
	public ResponseEntity<?>getUserByUsername(@PathVariable ("name") String name)
	{
		try {
			ResponseEntity res= null;
			Users foundUser = userService.fetchUserByUserName(name);
			if(foundUser!=null) 
			{
				return res.ok(foundUser);
			}
			else
			{
				throw new UserNotFoundException("invalid userName");
			}
		//return res;
		} catch (Exception e) {

			return new ResponseEntity<>(
			new ErrorResponce("User is not found ", e.getMessage()),
			HttpStatus.BAD_REQUEST);
			
		}
		
		
	}
	
}
