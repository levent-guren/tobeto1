package com.tobeto.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.dto.personel.PersonelSorgulaResponseDTO;
import com.tobeto.dto.personel.PersonelYaratRequestDTO;
import com.tobeto.dto.personel.PersonelYaratResponseDTO;
import com.tobeto.entity.Personel;
import com.tobeto.service.PersonelService;

@RestController
@RequestMapping("/api/personel")
public class PersonelController {
	@Autowired
	private PersonelService personelService;
	@Autowired
	@Qualifier("requestMapper")
	private ModelMapper requestMapper;
	@Autowired
	@Qualifier("responseMapper")
	private ModelMapper responseMapper;

	@PostMapping
	public PersonelYaratResponseDTO personelYarat(@RequestBody PersonelYaratRequestDTO dto) {
		Personel personel = requestMapper.map(dto, Personel.class);
		personel = personelService.addPersonel(personel);
		return responseMapper.map(personel, PersonelYaratResponseDTO.class);
	}

	@GetMapping
	public List<PersonelSorgulaResponseDTO> personelSorgular() {
		return personelService.getPersoneller().stream()
				.map(p -> responseMapper.map(p, PersonelSorgulaResponseDTO.class)).toList();
	}

}
