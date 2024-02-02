package com.tobeto.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.dto.adres.AdresYaratRequestDTO;
import com.tobeto.dto.adres.AdresYaratResponseDTO;
import com.tobeto.entity.Adres;
import com.tobeto.service.AdresService;

@RestController
@RequestMapping("/api/adres")
public class AdresController {
	@Autowired
	private AdresService adresService;
	@Autowired
	@Qualifier("requestMapper")
	private ModelMapper requestMapper;
	@Autowired
	@Qualifier("responseMapper")
	private ModelMapper responseMapper;

	@PostMapping
	public AdresYaratResponseDTO adresEkle(@RequestBody AdresYaratRequestDTO dto) {
		Adres adres = requestMapper.map(dto, Adres.class);
//		Personel personel = new Personel();
//		personel.setId(UUID.fromString(dto.getPersonelId()));
//		adres.setPersonel(personel);

		adres = adresService.addAddressToPersonel(adres);
		return responseMapper.map(adres, AdresYaratResponseDTO.class);
	}

}
