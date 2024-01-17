package com.tobeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
public class DortIslemController2 {

	@GetMapping("/topla")
	public int topla(@RequestParam("sayi1") int x, int sayi2) {
		return x + sayi2;
	}

	@GetMapping("/cikar")
	public int cikar() {
		return 3;
	}
}
