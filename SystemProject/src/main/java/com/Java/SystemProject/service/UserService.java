package com.Java.SystemProject.service;

import org.springframework.stereotype.Service;

import com.Java.SystemProject.entity.User;
@Service
public interface UserService {
public Iterable<User> findAll();
public User find(String id);
public void create(User user);
public void update(User user);
public void delete(String id);
}
