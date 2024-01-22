package com.tobeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.entity.Personel;
import com.tobeto.repository.PersonelRepository;

@Service
public class PersonelService {
	@Autowired
	private PersonelRepository personelRepository;

	public List<Personel> getAllPersonels() {
		return (List<Personel>) personelRepository.findAll();
	}
}
