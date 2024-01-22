package calistir6;

import java.util.ArrayList;
import java.util.List;

public class Calistir2 {
	public static void main(String[] args) {
		List<String> sehirler = new ArrayList<>();
		sehirler.add("Ankara");
		sehirler.add("İstanbul");
		sehirler.add("Adana");
		sehirler.add("Batman");
		sehirler.stream().forEach(t -> System.out.println(t));
	}
}
