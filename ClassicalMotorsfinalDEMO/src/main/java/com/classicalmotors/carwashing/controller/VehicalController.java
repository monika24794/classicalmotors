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
import com.classicalmotors.carwashing.custumexception.VehicalNotFoundException;
import com.classicalmotors.carwashing.dto.ErrorResponce;
import com.classicalmotors.carwashing.entity.Vehical;
import com.classicalmotors.carwashing.service.VehicalService;


@RestController
@RequestMapping("/vehical")
public class VehicalController {

	@Autowired(required=true)
	private VehicalService vehicalService;

	@PostMapping("/add")
	public ResponseEntity<?> registerdvehical(@RequestBody Vehical vehical) {
		Vehical createdUser = vehicalService.create(vehical);
		return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
	}

	@GetMapping("/all")
	public ResponseEntity<?> getAllvehical() {
		try {
			return new ResponseEntity<>(vehicalService.fetchAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponce("Vehical Feacthing is failead", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/getvehical/{vehicalId}")
	public ResponseEntity<?> getvehicalById(@PathVariable("vehicalId") Integer id) {
		try {
			return ResponseEntity.ok(vehicalService.fetchById(id));

		} catch (Exception e) {

			ErrorResponce errorResponce = new ErrorResponce("vehical Feacthing is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce, HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{vehicalId}")
	public ResponseEntity<?> updatevehicalById(@PathVariable("vehicalId") Integer id,
			@RequestBody Vehical updatevehical) {
		try {
			Vehical existingvehical = vehicalService.fetchById(id);

			return ResponseEntity.ok(vehicalService.update(updatevehical, existingvehical));

		} catch (Exception e) {

			ErrorResponce errorResponce = new ErrorResponce("vehical updation is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce, HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete/{vehicalId}")
	public ResponseEntity<?> deletevehicalById(@PathVariable("vehicalId") Integer id) {
		try {
			Vehical existingvehical = vehicalService.fetchById(id);
			return ResponseEntity.ok(vehicalService.delete(existingvehical));

		} catch (Exception e) {

			ErrorResponce errorResponce = new ErrorResponce("vehical deletion is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce, HttpStatus.BAD_REQUEST);

		}

	}

	@GetMapping("/getbyliecenceplate/{name}")
	public ResponseEntity<?> getByliecenceplate(@PathVariable("name") String liecenceplate) {
		try {
			ResponseEntity res = null;
			Vehical foundvehical = vehicalService.fetchVehicalByliecenceplate(liecenceplate);
			if (foundvehical != null) {
				return res.ok(foundvehical);
			} else {
				throw new VehicalNotFoundException("invalid userName");
			}
			// return res;
		} catch (Exception e) {

			return new ResponseEntity<>(new ErrorResponce("User is not found ", e.getMessage()),
					HttpStatus.BAD_REQUEST);

		}

	}

}
