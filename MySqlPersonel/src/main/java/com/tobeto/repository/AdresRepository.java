package com.tobeto.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tobeto.entity.Adres;

public interface AdresRepository extends JpaRepository<Adres, UUID> {

}
