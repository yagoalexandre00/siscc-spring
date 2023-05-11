package com.goltaraya.siscc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goltaraya.siscc.entities.User;
import com.goltaraya.siscc.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}

	public User update(Long id, User obj) {
		User user = repository.getReferenceById(id);
		updateData(user, obj);
		return repository.save(user);
	}

	public void updateData(User entity, User obj) {
		entity.setFirstName(obj.getFirstName());
		entity.setLastName(obj.getLastName());
		entity.setCpf(obj.getCpf());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
