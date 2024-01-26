package com.tobeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.entity.Yonetmen;
import com.tobeto.repository.YonetmenRepository;

@Service
public class YonetmenService {
	@Autowired
	private YonetmenRepository yonetmenRepository;

	public List<Yonetmen> getTumYonetmenler() {
		return yonetmenRepository.findAll();
	}

	public List<Yonetmen> getYonetmenler(String filmAdi) {
		return yonetmenRepository.findByFilmlerAdi(filmAdi);
	}
}
