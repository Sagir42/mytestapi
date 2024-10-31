package com.learning.springboot.firstwebapp.hello.login.authentication;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthentication {
	
	public boolean isValidCredentials(String userName, String password) {
		 boolean isValidUserName = userName.equalsIgnoreCase("Learning_Hub");
		boolean isValidPassword = password.equalsIgnoreCase("123");
		return isValidUserName && isValidPassword;
	}

}
