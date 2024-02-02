package com.tobeto.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordTest {
	private static String PASSWORD = "$2a$10$MERsWi0wjbp9HVO5K2fKuerBnIN4RpAWHiYQnVnBHZS6IsoDg.Xs.";

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		String password = encoder.encode("sifre");
		System.out.println(password);

		password = encoder.encode("sifre");
		System.out.println(password);
		System.out.println(encoder.matches("sifre", PASSWORD));
	}
}
