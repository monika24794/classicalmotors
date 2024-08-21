package com.classicalmotors.carwashing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicalmotors.carwashing.custumexception.UserNotFoundException;
import com.classicalmotors.carwashing.dao.ServiceRepo;
import com.classicalmotors.carwashing.entity.Services;
import com.classicalmotors.carwashing.entity.Users;

@Service
public class ServicesService implements CurdService<Services, Integer> {
	@Autowired
	private ServiceRepo serviceRepo;

	@Override
	public Services create(Services service) {

		return serviceRepo.save(service);
	}

	@Override
	public List<Services> fetchAll() {

		return serviceRepo.findAll();
	}

	@Override
	public Services fetchById(Integer id) {

		return serviceRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Invalid id"));
	}

	@Override
	public Services update(Services t1, Services t2) {
       t2.setPrice(t1.getPrice());
       t2.setServiceName(t1.getServiceName());
		return serviceRepo.save(t2);
	}

	@Override
	public String delete(Services service) {

		serviceRepo.delete(service);
		return service.getId() + "    deletead .";	}
	
    public Services fetchServicesByservicesName(String serviceName)
    {
		
		return serviceRepo.findByserviceName(serviceName);
	}
}
