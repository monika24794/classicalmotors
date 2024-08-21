package com.classicalmotors.carwashing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicalmotors.carwashing.custumexception.OfferNotFoundException;
import com.classicalmotors.carwashing.custumexception.UserNotFoundException;
import com.classicalmotors.carwashing.dao.OfferRepo;
import com.classicalmotors.carwashing.entity.Offer;

@Service
public class OfferService  implements CurdService<Offer, Integer> {
	
    @Autowired
	private OfferRepo offerRepo;
	@Override
	public Offer create(Offer t) {
		
		return offerRepo.save(t);
	}

	@Override
	public List<Offer> fetchAll() {
		
		return offerRepo.findAll();
	}

	@Override
	public Offer fetchById(Integer k) {
	
		return offerRepo.findById(k).orElseThrow(() -> new OfferNotFoundException("Invalid id"));
	}

	@Override
	public Offer update(Offer t1, Offer t2) {
		t2.setStart(t1.getStart());
		t2.setEnd(t1.getEnd());
		
		return offerRepo.save(t2);
	}

	@Override
	public String delete(Offer t) {
		offerRepo.delete(t);
		return t.getId() +" deletead";
	}

	
}
