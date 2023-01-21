package com.Java.SystemProject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Java.SystemProject.entity.User;
@Repository("UserRepository")
public interface UserRepository extends CrudRepository<User, String>{

}
