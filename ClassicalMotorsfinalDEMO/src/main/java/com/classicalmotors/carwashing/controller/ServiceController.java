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

import com.classicalmotors.carwashing.custumexception.ServiceNotFoundException;
import com.classicalmotors.carwashing.dto.ErrorResponce;
import com.classicalmotors.carwashing.entity.Services;
import com.classicalmotors.carwashing.service.ServicesService;

@RestController
@RequestMapping("/services")
public class ServiceController
{
	@Autowired
	 private  ServicesService servicesService;
	
	@PostMapping("/add")
	public ResponseEntity<?> registerdServices(@RequestBody Services services) {
		Services createdServices = servicesService.create(services);
		return new ResponseEntity<>(createdServices, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAllServices() {
		try {
			return new ResponseEntity<>(servicesService.fetchAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>
			(new ErrorResponce("Services Feacthing is failead", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}

	}
	@GetMapping("/getservices/{servicesId}")
	public ResponseEntity<?> getServicesById(@PathVariable("servicesId") Integer id) {
		try {
			return  ResponseEntity.ok(servicesService.fetchById(id));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce=
		    new ErrorResponce("Services Feacthing is failead", e.getMessage());
			return new ResponseEntity<>
			(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{servicesId}")
	public ResponseEntity<?> updateservicesById(@PathVariable("servicesId") Integer id,
			@RequestBody Services updateServices) {
		try {
			Services existingServices=servicesService.fetchById(id);
			
			return  ResponseEntity.ok(servicesService.update(updateServices, existingServices));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce= new ErrorResponce("Services updation is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("/delete/{servicesId}")
	public ResponseEntity<?>deleteservicesById(@PathVariable ("servicesId") Integer id)
	{ try {
		Services existingServices=servicesService.fetchById(id);
		return ResponseEntity.ok(servicesService.delete(existingServices));
				
	} catch (Exception e) {

		ErrorResponce errorResponce= new ErrorResponce("Services deletion is failead", e.getMessage());
		return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		
	}
		
	}
	@GetMapping("/getbyservicesName/{name}")
	public ResponseEntity<?>getservicesByservicesname(@PathVariable ("name") String name)
	{
		try {
			ResponseEntity res= null;
			Services foundServices = servicesService.fetchServicesByservicesName(name);
			if(foundServices!=null) 
			{
				return res.ok(foundServices);
			}
			else
			{
				throw new ServiceNotFoundException("invalid userName");
			}
		
		} catch (Exception e) {

			return new ResponseEntity<>(
			new ErrorResponce("Service is not found ", e.getMessage()),
			HttpStatus.BAD_REQUEST);
			
		}
		
		
	}
	
}
