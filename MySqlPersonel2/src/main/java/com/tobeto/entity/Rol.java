package com.tobeto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Rol extends EntityBase {
	private String adi;

	@ManyToOne
	private Kullanici kullanici;
}
