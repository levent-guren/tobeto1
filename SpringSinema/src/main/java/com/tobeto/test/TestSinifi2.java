package com.tobeto.test;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;

import com.tobeto.entity.Yonetmen;
import com.tobeto.repository.YonetmenRepository;

import jakarta.transaction.Transactional;

//@Component
@Order(2)
public class TestSinifi2 implements CommandLineRunner {
	@Autowired
	private YonetmenRepository yonetmenRepository;

	@Override
	@Transactional
	@SuppressWarnings("unused")
	public void run(String... args) throws Exception {
//		yonetmenRepository.findAll().stream().forEach(y -> {
//			System.out.println(y);
//			System.out.println(y.getFilmler());
//		});
		System.out.println("1 id'li yönetmen okunuyor");
		Optional<Yonetmen> oYonetmen = yonetmenRepository.findById(1);
		System.out.println("1 id'li yönetmen bir daha okunuyor");
		Optional<Yonetmen> oYonetmen2 = yonetmenRepository.findById(1);
		Yonetmen yonetmen = oYonetmen.get();

		yonetmen.setAdi("Levent");
		yonetmen.getFilmler().get(0).setAdi("Deneme");
		yonetmenRepository.save(yonetmen);

	}

}
