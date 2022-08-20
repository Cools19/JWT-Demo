package com.token.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.token.demo.model.JwtRequest;
import com.token.demo.model.JwtResponse;
import com.token.utility.JWTUtility;

@RestController
public class HomeController {
	
	@Autowired
	private JWTUtility jwtutility;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping("/")
	public String home() {
		return "Welcome to JWT demo project";
		
		@PostMapping("/authenticate")
		public JwtResponse authenticate(@RequestBody JwtRequest jwtRequest) throws Exception {
			try {
				authencationManager.authenticate(
						new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPasword())
						);
			
				
			}catch (BadCredentialsException e) {
				throw new Expection ("INVAILED_CREDENTIALS", e);
			}
		
		}
		
		
		
	}

}
