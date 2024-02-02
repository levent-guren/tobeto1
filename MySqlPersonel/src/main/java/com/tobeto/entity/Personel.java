package com.tobeto.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Personel extends EntityBase {
	private String adi;
	private String soyadi;
	@Column(unique = true)
	private String email;

	@ManyToOne
	// @JoinColumn(name = "bolum_no")
	private Bolum bolum;

	@OneToMany(mappedBy = "personel")
	private List<Adres> adresler;
}
