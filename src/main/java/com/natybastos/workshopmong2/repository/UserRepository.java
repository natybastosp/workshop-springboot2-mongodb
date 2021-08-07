package com.natybastos.workshopmong2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.natybastos.workshopmong2.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}