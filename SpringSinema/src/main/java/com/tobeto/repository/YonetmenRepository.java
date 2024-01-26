package com.tobeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entity.Yonetmen;

public interface YonetmenRepository extends JpaRepository<Yonetmen, Integer> {
	public List<Yonetmen> findByFilmlerAdi(String filmAdi);
}
