package com.classicalmotors.carwashing.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicalmotors.carwashing.custumexception.UserNotFoundException;
import com.classicalmotors.carwashing.dao.UserRepo;
import com.classicalmotors.carwashing.dao.VehicalRepo;
import com.classicalmotors.carwashing.entity.Users;
import com.classicalmotors.carwashing.entity.Vehical;
@Service
public class VehicalService implements CurdService<Vehical, Integer> { 
	
@Autowired
 private VehicalRepo vehicalRepo;

@Override
public Vehical create(Vehical t) {
	
	return vehicalRepo.save(t);
}

@Override
public List<Vehical> fetchAll() {
	
	return vehicalRepo.findAll();
}

@Override
public Vehical fetchById(Integer id) {
	
	return vehicalRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Invalid id"));
}

@Override
public Vehical update(Vehical t1, Vehical t2) {
	t2.setLiecenceplate(t1.getLiecenceplate());
	return vehicalRepo.save(t2);
}

@Override
public String delete(Vehical t) {
	vehicalRepo.delete(t);
	return  t.getId() + "    deletead .";
}

public Vehical fetchVehicalByliecenceplate(String liecenceplate) {
	// TODO Auto-generated method stub
	return vehicalRepo.findByliecenceplate(liecenceplate);
}

}
