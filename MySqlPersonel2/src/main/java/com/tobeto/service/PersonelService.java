package com.tobeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.entity.Personel;
import com.tobeto.repository.PersonelRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonelService {
	@Autowired
	private PersonelRepository personelRepository;

	@Transactional
	public Personel addPersonel(Personel personel) {
		return personelRepository.save(personel);
	}

	public List<Personel> getPersoneller() {
		return personelRepository.findAll();
	}
}
