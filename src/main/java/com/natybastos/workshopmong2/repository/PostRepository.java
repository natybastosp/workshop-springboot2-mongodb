package com.natybastos.workshopmong2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.natybastos.workshopmong2.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}