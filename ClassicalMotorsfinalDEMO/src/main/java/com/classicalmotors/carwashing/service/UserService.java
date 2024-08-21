package com.classicalmotors.carwashing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classicalmotors.carwashing.custumexception.UserNotFoundException;
import com.classicalmotors.carwashing.dao.UserRepo;
import com.classicalmotors.carwashing.entity.Users;

@Service
public class UserService implements CurdService<Users, Integer> {

	@Autowired
	private UserRepo userRepo;

	@Override
	public Users create(Users user) {

		return userRepo.save(user);
	}

	@Override
	public List<Users> fetchAll() {
		return userRepo.findAll();
	}

	@Override
	public Users fetchById(Integer id) {

		return userRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Invalid id"));
	}

	@Override
	public Users update(Users updateadUser, Users existingUser) {
		existingUser.setUsername(updateadUser.getUsername());
		existingUser.setPassword(updateadUser.getPassword());
		existingUser.setPhoneNo(updateadUser.getPhoneNo());
		return userRepo.save(existingUser);
	}

	@Override
	public String delete(Users user) {
		userRepo.delete(user);
		return user.getId() + "    deletead .";
	}

	public Users fetchUserByUserName(String userName) {
		
		return userRepo.findByuserName(userName);
	}

}
