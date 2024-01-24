package com.tobeto.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "personel")
public class Personel {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "adi")
	private String isim;
}
