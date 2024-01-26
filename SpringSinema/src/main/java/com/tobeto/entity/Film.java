package com.tobeto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(exclude = "yonetmen")
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String adi;

//	@OneToOne
//	@OneToMany
//	@ManyToOne
//	@ManyToMany

	@ManyToOne(fetch = FetchType.EAGER)
	private Yonetmen yonetmen;
}
