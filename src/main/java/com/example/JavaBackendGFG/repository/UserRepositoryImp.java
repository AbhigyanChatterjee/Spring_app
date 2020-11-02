package com.example.JavaBackendGFG.repository;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.example.JavaBackendGFG.model.User;

@Repository
public class UserRepositoryImp implements UserRepository{

	private HashMap<String, User> db = new HashMap<>();
	
	@Override
	public User storeUser(User user) {
		db.put(user.getEmail(), user);
		return db.get(user.getEmail());
	}
	
}
