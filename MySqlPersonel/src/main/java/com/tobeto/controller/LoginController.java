package com.tobeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.dto.login.LoginRequestDTO;
import com.tobeto.dto.login.LoginResponseDTO;
import com.tobeto.service.JwtService;

@RestController

public class LoginController {
	@Autowired
	private JwtService jwtService;

	@PostMapping("/api/login")
	public LoginResponseDTO login(@RequestBody LoginRequestDTO dto) {
		UserDetails user = User.builder().username(dto.getEmail()).password(dto.getPassword()).build();
		String token = jwtService.tokenUret(user);
		return new LoginResponseDTO(token);
	}

}
