package com.tobeto.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entity.Kullanici;

public interface KullaniciRepository extends JpaRepository<Kullanici, UUID> {
	Optional<Kullanici> findByEmail(String email);
}
