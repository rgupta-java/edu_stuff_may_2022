package com.bankapp.service;

import com.bankapp.entities.UserEntity;

public interface UserService {
	public UserEntity findByUsername(String username);
	public void addUser(UserEntity userEntity);
}
