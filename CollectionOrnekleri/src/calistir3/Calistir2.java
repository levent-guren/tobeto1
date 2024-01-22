package calistir3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Calistir2 {
	public static void main(String[] args) {
		List<String> sehirler = new ArrayList<>();
		sehirler.add("Ankara");
		sehirler.add("İstanbul");
		sehirler.add("Adana");
		sehirler.add("Batman");
		sehirler.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
	}
}
