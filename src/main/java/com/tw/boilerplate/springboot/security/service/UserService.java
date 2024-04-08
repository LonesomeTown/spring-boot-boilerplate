package com.tw.boilerplate.springboot.security.service;

import com.tw.boilerplate.springboot.model.User;
import com.tw.boilerplate.springboot.security.dto.AuthenticatedUserDto;
import com.tw.boilerplate.springboot.security.dto.RegistrationRequest;
import com.tw.boilerplate.springboot.security.dto.RegistrationResponse;

// rimmel asghar
public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
