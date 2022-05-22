package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bankapp.entities.UserEntity;
import com.bankapp.service.UserService;

@Service
public class DetailService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserEntity userEntity = userService.findByUsername(username);
		if (userEntity == null) {
			throw new UsernameNotFoundException("user is not found");
		}
		// spring sec dont userstand my user i need to convert this user to spring
		// understand
		SecUser secUser = new SecUser(userEntity);

		return secUser;
	}

}
