package com.smq.springdatajpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smq.springdatajpa.dao.UserRepository;
@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void updateUserById(String username,int id) {
		userRepository.updateUserById(username, id);
	}
	
	public void deleteUserById(int id) {
		userRepository.deleteUserById(id);
	}

}
