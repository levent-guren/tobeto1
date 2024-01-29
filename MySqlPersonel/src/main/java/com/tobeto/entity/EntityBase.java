package com.tobeto.entity;

import java.time.LocalTime;
import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

@MappedSuperclass
@Data
public class EntityBase {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private LocalTime yaratmaTarihi;
	private LocalTime guncellemeTarihi;

	@PrePersist
	public void prePersist() {
		yaratmaTarihi = LocalTime.now();
	}

	@PreUpdate
	public void preUpdate() {
		guncellemeTarihi = LocalTime.now();
	}
}
