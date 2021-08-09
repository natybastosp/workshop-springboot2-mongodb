package com.natybastos.workshopmong2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natybastos.workshopmong2.domain.User;
import com.natybastos.workshopmong2.repository.UserRepository;
import com.natybastos.workshopmong2.service.exeption.ObjectNotFoundExeption;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExeption("Objeto não encontrado"));
		}

}
