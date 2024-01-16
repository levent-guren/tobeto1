package com.tobeto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tobeto.beans.Bilgisayar;

@Configuration
public class SpringConfig {

	@Bean("b1")
	Bilgisayar getBilgisayar() {
		Bilgisayar bilgisayar = new Bilgisayar();
		bilgisayar.setMarka("Apple");
		bilgisayar.setModel("IMac 2023");
		return bilgisayar;
	}
}
