package com.natybastos.workshopmong2.service;

import 	java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natybastos.workshopmong2.domain.User;
import com.natybastos.workshopmong2.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}

}
