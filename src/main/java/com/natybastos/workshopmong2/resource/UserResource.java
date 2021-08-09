package com.natybastos.workshopmong2.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.natybastos.workshopmong2.domain.User;
import com.natybastos.workshopmong2.dto.UserDTO;
import com.natybastos.workshopmong2.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<UserDTO> findById(@ PathVariable String Id){
		User obj = service.findById(Id);
		return ResponseEntity.ok().body(new UserDTO(obj));
	}
}
