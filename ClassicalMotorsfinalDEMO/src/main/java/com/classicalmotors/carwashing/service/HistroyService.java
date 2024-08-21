package com.classicalmotors.carwashing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicalmotors.carwashing.custumexception.UserNotFoundException;
import com.classicalmotors.carwashing.dao.HistroyRepo;
import com.classicalmotors.carwashing.entity.Histroy;

@Service
public class HistroyService implements CurdService<Histroy, Integer> {

	@Autowired 
	private HistroyRepo histroyRepo;
	@Override
	public Histroy create(Histroy t) {
	
		return histroyRepo.save(t);
	}

	@Override
	public List<Histroy> fetchAll() {
	
		return histroyRepo.findAll();
	}

	@Override
	public Histroy fetchById(Integer k) {
		
		return histroyRepo.findById(k).orElseThrow(() -> new UserNotFoundException("Invalid id"));
	}

	@Override
	public Histroy update(Histroy t1, Histroy t2) {
		t2.setDate(t1.getDate());
		t2.setRateing(t1.getRateing());
		t2.setStatus(t1.getStatus());
		t2.setNotes(t1.getNotes());
		return histroyRepo.save(t2);
	}

	@Override
	public String delete(Histroy t) {
		histroyRepo.delete(t);
		return t.getId()+"  deletead";
	}

	public Histroy fetchHistroyBystatus(String status)
	{
		return histroyRepo.findBystatus(status);
	}
}
