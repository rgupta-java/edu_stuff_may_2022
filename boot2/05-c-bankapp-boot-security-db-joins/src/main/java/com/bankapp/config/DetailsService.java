package com.bankapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bankapp.entities.UserEntity;
import com.bankapp.service.UserService;

//it is a cocept used by Authentication provide to check user identity.. he dont what tech i am usering...
@Service
public class DetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity=userService.findByUsername(username);
		
		if(userEntity==null) {
			throw new UsernameNotFoundException("user not found");
		}
		//spring sec dont understand userEntity===> UserDetails imp.. i need to apply some
	//e trick to conver this object to hte object that spring understand
		return new SecUser(userEntity);
	}

}
