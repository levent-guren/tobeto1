package com.tobeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.entity.Adres;
import com.tobeto.repository.AdresRepository;

import jakarta.transaction.Transactional;

@Service
public class AdresService {
	@Autowired
	private AdresRepository adresRepository;

	@Transactional
	public Adres addAddressToPersonel(Adres adres) {
		return adresRepository.save(adres);
	}
}
