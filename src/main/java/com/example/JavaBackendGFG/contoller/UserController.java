package com.example.JavaBackendGFG.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JavaBackendGFG.dto.UserDto;
import com.example.JavaBackendGFG.model.User;
import com.example.JavaBackendGFG.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/saveUser")
	
	public User saveUser(@RequestBody UserDto userDto) {
		return userService.saveUser(userDto);
	}
	
}
