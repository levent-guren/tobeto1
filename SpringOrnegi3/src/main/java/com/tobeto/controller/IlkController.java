package com.tobeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/merhaba")
// istek 
// http://localhost:8080/merhaba 
// olarak gelirse bu sınıfı çalıştır

public class IlkController {

	@GetMapping
	@ResponseBody
	public String deneme() {
		System.out.println("deneme cagirildi2");
		return "Merhaba";
	}
}
