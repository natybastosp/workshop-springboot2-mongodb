package com.natybastos.workshopmong2.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natybastos.workshopmong2.domain.Post;
import com.natybastos.workshopmong2.repository.PostRepository;
import com.natybastos.workshopmong2.service.exeption.ObjectNotFoundExeption;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public List<Post> findAll() {
		return repo.findAll();
	}

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundExeption("Objeto não encontrado"));
	}
		
	public List<Post> findByTitle(String text) {
		return repo.searchTitle(text);
	}
	
	public List<Post> fullSearch(String texte, Date minDate, Date maxdate){
		maxdate = new Date(maxdate.getTime() + 24*60*1000);
		return repo.fullSearche(texte, minDate, maxdate);
	}
}
