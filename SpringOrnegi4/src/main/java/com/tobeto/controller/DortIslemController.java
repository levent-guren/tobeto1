package com.tobeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DortIslemController {

	@RequestMapping(value = "/topla", method = RequestMethod.GET)
	@ResponseBody
	public int topla() {
		return 5;
	}

	@GetMapping("/cikar")
	@ResponseBody
	public int cikar() {
		return 3;
	}
}
