package com.tobeto.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.bean.Personel;

@RestController
@RequestMapping("/personel")
public class PersonelController {
	@GetMapping(path = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public Personel getPersonel(@PathVariable int id) {
		Personel personel = new Personel();
		personel.setId("T" + id);
		personel.setAdi("Murteza");
		personel.setYasi(24);
		return personel;
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> createPersonel(@RequestBody Personel personel) {
		System.out.println(personel);
		if (personel.getAdi().length() < 2) {
			// hata durumu
			JSONObject result = new JSONObject();
			result.put("mesaj", "Personel adı en az 2 karakter olmalıdır");
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(result.toString());
		}
		JSONObject result = new JSONObject();
		result.put("mesaj", "Personel yaratıldı");
		return ResponseEntity.ok(result.toString());
	}
}
