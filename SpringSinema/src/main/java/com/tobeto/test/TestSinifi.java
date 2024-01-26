package com.tobeto.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
@Order(1)
public class TestSinifi implements CommandLineRunner {
	@Value("${adi:Yok}")
	private String adi;

	@Autowired
	private Environment env;

	@Override
	public void run(String... args) throws Exception {
		log.info("Merhaba " + adi);
		log.info("Merhaba " + env.getProperty("adi"));
	}

}
