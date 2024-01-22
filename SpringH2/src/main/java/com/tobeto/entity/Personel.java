package com.tobeto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Personel {
	@Id
	private int id;
	private String adi;
}
