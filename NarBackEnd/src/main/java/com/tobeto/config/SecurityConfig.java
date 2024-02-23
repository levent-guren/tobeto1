package com.tobeto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		// @formatter:off
		http
		.csrf(AbstractHttpConfigurer::disable)
		.authorizeHttpRequests(authorize -> authorize
				.requestMatchers("/api/v1/login").permitAll()
				.anyRequest().authenticated()
				)
		     .sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		     //.addFilterBefore(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class)
		     ;
		// @formatter:on

		return http.build();
	}

	@Bean
	PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
