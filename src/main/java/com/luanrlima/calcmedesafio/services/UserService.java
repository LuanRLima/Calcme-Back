package com.luanrlima.calcmedesafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luanrlima.calcmedesafio.DTO.UserDTO;
import com.luanrlima.calcmedesafio.domain.User;
import com.luanrlima.calcmedesafio.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
		
	public List<User> findAll(){
		return repo.findAll();	
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
}
