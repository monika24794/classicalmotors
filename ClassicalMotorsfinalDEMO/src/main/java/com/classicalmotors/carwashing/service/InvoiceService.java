package com.classicalmotors.carwashing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicalmotors.carwashing.custumexception.InvoiceNotFoundException;
import com.classicalmotors.carwashing.custumexception.UserNotFoundException;
import com.classicalmotors.carwashing.dao.InvoiceRepo;
import com.classicalmotors.carwashing.entity.Invoice;


@Service
public class InvoiceService implements CurdService<Invoice, Integer>{
	@Autowired
	private InvoiceRepo invoiceRepo;

	@Override
	public Invoice create(Invoice t) {
		
		return invoiceRepo.save(t);
	}

	@Override
	public List<Invoice> fetchAll() {
		// TODO Auto-generated method stub
		return invoiceRepo.findAll();
	}

	@Override
	public Invoice fetchById(Integer k) {
		// TODO Auto-generated method stub
		return invoiceRepo.findById(k).orElseThrow(() -> new InvoiceNotFoundException("Invalid id"));
	}

	@Override
	public Invoice update(Invoice t1, Invoice t2) {
		t2.setIssued(t1.getIssued());
		t2.setTotalAmount(t1.getTotalAmount());
		t2.setStatus(t1.getStatus());
		return invoiceRepo.save(t2);
	}

	@Override
	public String delete(Invoice t) {
		invoiceRepo.delete(t);
		return t.getId() +" Deletead";
	}

}
