package calistir;

import beans.Kitap;
import beans.Kiyaslanabilir;
import beans.Kutu;

public class Calistir {

	public static void main(String[] args) {
		// @formatter:off
		Kitap[] kitaplar = { 
				new Kitap(153), new Kitap(87), 
				new Kitap(34), new Kitap(23), 
				new Kitap(341), new Kitap(45), 
				new Kitap(864), new Kitap(129), 
				new Kitap(231), new Kitap(97) 
		};
		// @formatter:on
		sirala(kitaplar);
		for (Kitap kitap : kitaplar) {
			System.out.println(kitap);
		}
//		Stream.of(kitaplar).forEach(System.out::println);

		// @formatter:off
		Kutu[] kutular = { 
				new Kutu(14), new Kutu(23), 
				new Kutu(13), new Kutu(11), 
				new Kutu(5), new Kutu(22)
		};
		// @formatter:on
		sirala(kutular);
		for (Kutu kutu : kutular) {
			System.out.println(kutu);
		}
	}

	private static void sirala(Kiyaslanabilir[] objeler) {
		for (int i = 0; i < objeler.length - 1; i++) {
			for (int j = i + 1; j < objeler.length; j++) {
				// i. sıradaki ile j. sıradaki elemanı kıyasla
				if (objeler[i].kiyasla(objeler[j]) > 0) {
					// üstteki daha büyük. Yer değiştir.
					Kiyaslanabilir temp = objeler[i];
					objeler[i] = objeler[j];
					objeler[j] = temp;
				}
			}
		}
	}
}
