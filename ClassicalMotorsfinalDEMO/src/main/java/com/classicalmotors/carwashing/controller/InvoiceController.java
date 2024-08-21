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
import com.classicalmotors.carwashing.entity.Invoice;
import com.classicalmotors.carwashing.entity.Offer;
import com.classicalmotors.carwashing.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController 
{
@Autowired
private InvoiceService invoiceService;
	@PostMapping("/add")
	public ResponseEntity<?> registerdInvoice(@RequestBody Invoice invoice  ) {
		Invoice  createdInvoice = invoiceService.create(invoice);
		return new ResponseEntity<>(createdInvoice, HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllinvoice() {
		try {
			return new ResponseEntity<>(invoiceService.fetchAll(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>
			(new ErrorResponce("Invoice Feacthing is failead", e.getMessage()),
					HttpStatus.BAD_REQUEST);
		}

	}
	@GetMapping("/getinvoice/{invoiceId}")
	public ResponseEntity<?> getInvoiceById(@PathVariable("invoiceId") Integer id) {
		try {
			return  ResponseEntity.ok(invoiceService.fetchById(id));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce=
		    new ErrorResponce("Invoice Feacthing is failead", e.getMessage());
			return new ResponseEntity<>
			(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update/{invoiceId}")
	public ResponseEntity<?> updateInvoiceById(@PathVariable("invoiceId") Integer id,
			@RequestBody Invoice updateinvoice) {
		try {
			Invoice existinginvoice=invoiceService.fetchById(id);
			
			return  ResponseEntity.ok(invoiceService.update(updateinvoice, existinginvoice));
			
		} catch (Exception e) {
			
			ErrorResponce errorResponce= new ErrorResponce("Invoice updation is failead", e.getMessage());
			return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		}
	}
	@DeleteMapping("/delete/{invoiceId}")
	public ResponseEntity<?>deleteinvoiceById(@PathVariable ("invoiceId") Integer id)
	{ try {
		Invoice existingoffer=invoiceService.fetchById(id);
		return ResponseEntity.ok(invoiceService.delete(existingoffer));
				
	} catch (Exception e) {

		ErrorResponce errorResponce= new ErrorResponce("Invoice deletion is failead", e.getMessage());
		return new ResponseEntity<>(errorResponce,HttpStatus.BAD_REQUEST);
		
	}
	
}
}
