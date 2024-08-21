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
import com.classicalmotors.carwashing.entity.Offer;
import com.classicalmotors.carwashing.entity.Users;
import com.classicalmotors.carwashing.service.OfferService;

@RestController
@RequestMapping("/offer")
public class OfferController {
	@Autowired
	private OfferService offerService;
	
	@PostMapping("/add")
	public ResponseEntity<?> registerdUser(@RequestBody Offer offer ) {
		Offer  createdOffer = offerService.create(offer);
		return new ResponseEntity<>(createdOffer, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAlloffers() {
		try {
			return new ResponseEntity<>(offerService.fetchAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>
			(new ErrorResponce("offer Feacthing is failead", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}

	}
	@GetMapping("/getoffer/{offerId}")
	public ResponseEntity<?> getofferById(@PathVariable("offerId") Integer id) {
		try {
			return  ResponseEntity.ok(offerService.fetchById(id));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce=
		    new ErrorResponce("offer Feacthing is failead", e.getMessage());
			return new ResponseEntity<>
			(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{offerId}")
	public ResponseEntity<?> updateofferById(@PathVariable("offerId") Integer id,
			@RequestBody Offer updateoffer) {
		try {
			Offer existingoffer=offerService.fetchById(id);
			
			return  ResponseEntity.ok(offerService.update(updateoffer, existingoffer));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce= new ErrorResponce("Offer updation is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("/delete/{offerId}")
	public ResponseEntity<?>deleteofferById(@PathVariable ("offerId") Integer id)
	{ try {
		Offer existingoffer=offerService.fetchById(id);
		return ResponseEntity.ok(offerService.delete(existingoffer));
				
	} catch (Exception e) {

		ErrorResponce errorResponce= new ErrorResponce("Offer deletion is failead", e.getMessage());
		return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		
	}
		
	}
}
