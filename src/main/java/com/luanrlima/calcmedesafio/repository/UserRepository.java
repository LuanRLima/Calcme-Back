package com.luanrlima.calcmedesafio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luanrlima.calcmedesafio.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
