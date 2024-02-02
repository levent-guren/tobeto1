package com.tobeto.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Bolum extends EntityBase {
	private String adi;

	@OneToMany(mappedBy = "bolum")
	private List<Personel> personeller;
}
