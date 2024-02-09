package com.tobeto;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import kps.webservice.KPSPublic;

@SpringBootApplication
public class KpsDenemeApplication {

	public static void main(String[] args) {
//		SpringApplication.run(KpsDenemeApplication.class, args);
		System.out.println(
				new KPSPublic().getKPSPublicSoap().tcKimlikNoDogrula(30850860202L, "Ömer", "Özgür", 1998));
	}

}
