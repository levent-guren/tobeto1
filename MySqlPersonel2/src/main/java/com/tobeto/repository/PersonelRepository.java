package com.tobeto.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tobeto.entity.Personel;

public interface PersonelRepository extends JpaRepository<Personel, UUID> {

	@Query("from Personel p where p.bolum.adi = :bolumAdi")
	List<Personel> bolumAdinaGorePersonelAra(@Param("bolumAdi") String adi);

	@Query(value = "select p.*, b.* from personel p join bolum b on (p.bolum_id = b.id) where b.adi = :bolumAdi", nativeQuery = true)
	List<List<Object>> bolumAdinaGorePersonelAra2(@Param("bolumAdi") String adi);

}