package com.example.JavaBackendGFG.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JavaBackendGFG.dto.UserDto;
import com.example.JavaBackendGFG.model.User;
import com.example.JavaBackendGFG.repository.UserRepository;
import com.example.JavaBackendGFG.repository.UserRepositoryImp;


@Service
public class UserService {

	@Autowired
	UserRepositoryImp userRepository;
	
	public User saveUser(UserDto userDto) {
		User user = new User(userDto.getName(), userDto.getEmail(), userDto.getContactNo());
//		user.setName(userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user.setContactNo(userDto.getContactNo());
		return userRepository.storeUser(user);
	}
}
