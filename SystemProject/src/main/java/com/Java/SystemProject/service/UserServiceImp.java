package com.Java.SystemProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Java.SystemProject.entity.User;
import com.Java.SystemProject.repository.UserRepository;
@Service("UserService")
public class UserServiceImp implements UserService{
@Autowired
private UserRepository userRepository;
	@Override
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}
	@Override
	public User find(String id) {
		return userRepository.findById(id).get();
	}
	@Override
	public void create(User user) {
		userRepository.save(user);
	}
	@Override
	public void update(User user) {
		userRepository.save(user);
	}
	@Override
	public void delete(String  id) {
		userRepository.deleteById(id);
		
	}
	
}
