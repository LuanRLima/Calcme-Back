package com.luanrlima.calcmedesafio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luanrlima.calcmedesafio.domain.User;
import com.luanrlima.calcmedesafio.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
		
	public List<User> findAll(){
		return repo.findAll();	
	}
}
