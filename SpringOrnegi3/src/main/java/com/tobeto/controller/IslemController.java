package com.tobeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hesap")

// test ederken:
// http://localhost:8080/hesap?sayi1=5&sayi2=3
// yazarak test ettik.

public class IslemController {

	@GetMapping
	@ResponseBody
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
}
