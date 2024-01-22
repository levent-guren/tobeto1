package calistir;

import java.util.ArrayList;
import java.util.List;

public class Calistir {
	public static void main(String[] args) {
		List<Sarki> sarkilar = new ArrayList<Sarki>();
		sarkilar.add(new Sarki("Anılar", 3.2));
		sarkilar.add(new Sarki("Yol", 5.5));
		sarkilar.add(new Sarki("Uzun", 3.6));
		sarkilar.add(new Sarki("Gökyüzü", 4.8));
		sarkilar.add(new Sarki("Sarı", 4.2));
		sarkilar.add(new Sarki("Papatya", 7.1));

		sarkilar.stream().filter(s -> s.getSure() > 5.0).forEach(System.out::println);
	}
}
