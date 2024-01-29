package com.tobeto.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Adres extends EntityBase {
	private String il;
	private String ilce;
	private String adres;
}
