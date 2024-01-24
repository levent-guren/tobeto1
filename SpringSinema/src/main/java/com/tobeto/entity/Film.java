package com.tobeto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adi;

//	@OneToOne
//	@OneToMany
//	@ManyToOne
//	@ManyToMany

	@ManyToOne
	private Yonetmen yonetmen;
}
