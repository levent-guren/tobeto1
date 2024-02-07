package com.tobeto.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Kullanici extends EntityBase {
	@Column(unique = true)
	private String email;

	private String sifre;

	@OneToMany(mappedBy = "kullanici")
	private List<Rol> roller;
}
