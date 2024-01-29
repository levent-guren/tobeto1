package com.tobeto.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Personel extends EntityBase {
	private String adi;
	private String soyadi;
	private String email;
}
