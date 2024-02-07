package com.tobeto.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tobeto.entity.Kullanici;

public interface KullaniciRepository extends JpaRepository<Kullanici, UUID> {
	Optional<Kullanici> findByEmail(String email);

	@Query(value = "select k from Kullanici k where k.email = :email")
	Optional<Kullanici> emailAlaninaGoreAra(@Param("email") String eposta);

}
