package com.classicalmotors.carwashing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classicalmotors.carwashing.custumexception.AppointmentNotFoundException;
import com.classicalmotors.carwashing.dto.ErrorResponce;
import com.classicalmotors.carwashing.entity.Appointment;
import com.classicalmotors.carwashing.service.AppointmentServices;
@CrossOrigin("*")
@RestController
@RequestMapping("/appointment")
public class AppointmentController 
{

		@Autowired
		 private AppointmentServices appointmentServices;
		
		@PostMapping("/add")
		public ResponseEntity<?> registerdServices(@RequestBody Appointment appointment) {
			Appointment createdServices = appointmentServices.create(appointment);
			return new ResponseEntity<>(createdServices, HttpStatus.CREATED);
		}

		@GetMapping("/all")
		public ResponseEntity<?> getAllServices() {
			try {
				return new ResponseEntity<>(appointmentServices.fetchAll(), HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<>
				(new ErrorResponce("Appointment Feacthing is failead", e.getMessage()),
						HttpStatus.BAD_REQUEST);
			}

		}
		@GetMapping("/getappointment/{appointmentId}")
		public ResponseEntity<?> getServicesById(@PathVariable("appointmentId") Integer id) {
			try {
				return  ResponseEntity.ok(appointmentServices.fetchById(id));
				
			} catch (Exception e) {
				
				ErrorResponce errorResponce=
			    new ErrorResponce("Services Feacthing is failead", e.getMessage());
				return new ResponseEntity<>
				(errorResponce,HttpStatus.BAD_REQUEST);
			}
		}

		@PutMapping("/update/{appointmentId}")
		public ResponseEntity<?> updateservicesById(@PathVariable("appointmentId") Integer id,
				@RequestBody Appointment updateServices) {
			try {
				Appointment existingServices=appointmentServices.fetchById(id);
				
				return  ResponseEntity.ok(appointmentServices.update(updateServices, existingServices));
				
			} catch (Exception e) {
				
				ErrorResponce errorResponce= new ErrorResponce("Appointment updation is failead", e.getMessage());
				return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
			}
		}
		@DeleteMapping("/delete/{appointmentId}")
		public ResponseEntity<?>deleteservicesById(@PathVariable ("appointmentId") Integer id)
		{ try {
			Appointment existingServices=appointmentServices.fetchById(id);
			return ResponseEntity.ok(appointmentServices.delete(existingServices));
					
		} catch (Exception e) {

			ErrorResponce errorResponce= new ErrorResponce("Appointment deletion is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
			
		}
			
		}
		@GetMapping("/getbystatus/{status}")
		public ResponseEntity<?>getservicesByservicesname(@PathVariable ("status") String status)
		{
			try {
				ResponseEntity res= null;
				Appointment foundAppointment= appointmentServices.fetchAppointmentByStatus(status);
				if(foundAppointment!=null) 
				{
					return res.ok(foundAppointment);
				}
				else
				{
					throw new AppointmentNotFoundException("invalid Appointment Status");
				}
			
			} 
			catch (Exception e) 
			{

				return new ResponseEntity<>(
				new ErrorResponce("Appointment is not found ", e.getMessage()),
				HttpStatus.BAD_REQUEST);
				
			}
		}

		
	}


