package com.tobeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class Bilgisayar implements ApplicationRunner {
	@Autowired
	private Ram ram;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("Bilgisayar'dan merhaba");
	}

}
