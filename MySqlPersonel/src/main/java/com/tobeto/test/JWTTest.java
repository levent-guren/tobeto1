package com.tobeto.test;

import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;

public class JWTTest {
	private static final String KEY = "CUe9j1dUBlvPlOq9tWXrriBZLDDxnWvLSqsO6YhNEHoVdhYX+3rUeWi1FY/Vv7WJ+/IQ8R1IzNwpVkyP4lJRIw==";

	public static void main(String[] args) {
		// keyUret();
		JwtBuilder builder = Jwts.builder();

		// add custom keys
		Map<String, Object> customKeys = new HashMap<>();
		customKeys.put("adi", "Levent");
		customKeys.put("soyadi", "GÜREN");
		builder = builder.claims(customKeys);

		Instant tarih = Instant.now().plus(15, ChronoUnit.MINUTES);

		builder = builder.subject("login").id("13-23-ab").issuedAt(new Date()).expiration(Date.from(tarih));

		String jwt = builder.signWith(getKey()).compact();
		System.out.println(jwt);
	}

	public static void keyUret() {
		Key key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
		String str = Encoders.BASE64.encode(key.getEncoded());
		System.out.println(str);
	}

	public static Key getKey() {
		Key key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(KEY));
		return key;
	}

}
