package com.tobeto.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.dto.YonetmenDTO;
import com.tobeto.entity.Yonetmen;
import com.tobeto.service.YonetmenService;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/yonetmen")
public class YonetmenController {
	@Autowired
	private YonetmenService yonetmenService;
	@Autowired
	private ModelMapper mapper;

	@GetMapping
	@Transactional
	public List<YonetmenDTO> getTumYonetmenler() {
		List<Yonetmen> dbYonetmenler = yonetmenService.getTumYonetmenler();
		return dbYonetmenler.stream().map(y -> {
			YonetmenDTO dto = mapper.map(y, YonetmenDTO.class);
			dto.setAd(y.getAdi());
			return dto;
		}).toList();

		// return yonetmenService.getTumYonetmenler().stream().map(y -> mapper.map(y,
		// YonetmenDTO.class)).toList();
	}

	@GetMapping("/film")
	public List<YonetmenDTO> getMethodName(@RequestParam String filmAdi) {
		List<Yonetmen> yonetmenler = yonetmenService.getYonetmenler(filmAdi);
		return yonetmenler.stream().map(y -> {
			YonetmenDTO dto = mapper.map(y, YonetmenDTO.class);
			dto.setAd(y.getAdi());
			return dto;
		}).toList();
	}

}
