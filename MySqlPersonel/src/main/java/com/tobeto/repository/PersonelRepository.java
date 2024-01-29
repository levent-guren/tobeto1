package com.tobeto.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, UUID> {

}
