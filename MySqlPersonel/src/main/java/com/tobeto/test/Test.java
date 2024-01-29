package com.tobeto.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tobeto.entity.Personel;
import com.tobeto.repository.PersonelRepository;

@Component
public class Test implements CommandLineRunner {
	@Autowired
	private PersonelRepository personelRepository;

	@Override
	public void run(String... args) throws Exception {
		Personel p = new Personel();
		p = personelRepository.save(p);
		p.setAdi("Aslı");
		p = personelRepository.save(p);

	}

}
