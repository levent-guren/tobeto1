package com.tobeto.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	@Bean
	ModelMapper getModelMapper() {
		ModelMapper mapper = new ModelMapper();
		// source ve destination sınıflarındaki değişken isimlerinin tamamen aynı
		// olmasına bakıyor. Bunu yazmazsak değişken ismini startWith ile arıyor yani ad
		// değişkenini adlari değişkenine aktarmaya çalışıyor.
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		return mapper;
	}
}
