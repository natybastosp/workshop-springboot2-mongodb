package com.natybastos.workshopmong2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natybastos.workshopmong2.domain.User;
import com.natybastos.workshopmong2.dto.UserDTO;
import com.natybastos.workshopmong2.repository.UserRepository;
import com.natybastos.workshopmong2.service.exeption.ObjectNotFoundExeption;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExeption("Objeto não encontrado"));
		}

	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
}
