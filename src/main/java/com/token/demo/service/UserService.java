package com.token.demo.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
	
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		// Logic to get the User from the database
		return new User("admin", "password", new ArrayList<>());
	}

}
