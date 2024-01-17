package calistir;

import java.util.Scanner;

public class Calistir {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Cinsiyet (E/K):");
		String cinsiyet = scanner.next();
		if ("E".equals(cinsiyet)) {
			// Erkek
			test(Cinsiyet.ERKEK);
		} else {
			// Kadın
			test(Cinsiyet.KADIN);
		}

		scanner.close();
	}

	public static void test(Cinsiyet c) {
		System.out.println(c.getAdi());
	}
}
