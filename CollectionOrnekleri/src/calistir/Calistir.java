package calistir;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Calistir {
	public static void main(String[] args) {
		listOrnegi();
		mapOrnegi();
		setOrnegi();
	}

	private static void setOrnegi() {
		System.out.println("-------------");
		Set<String> degerler = new HashSet<String>();
		degerler.add("Ali");
		degerler.add("Veli");
		degerler.add("Ayşe");
		degerler.add("Kamuran");
		degerler.add("Veli");
		degerler.add("Ali");
		Iterator<String> itr = degerler.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			System.out.println(s);
		}
	}

	private static void mapOrnegi() {
		Map<Integer, String> sehirler = new HashMap<>();
		sehirler.put(34, "İstanbul");
		sehirler.put(1, "Adana");
		sehirler.put(6, "Ankara");
		System.out.println(sehirler.get(6));

	}

	private static void listOrnegi() {
		List<String> sehirler = new ArrayList<>();
		sehirler.add("Ankara");
		sehirler.add("İstanbul");
		sehirler.add("Adana");
		sehirler.add("Batman");
		System.out.println(sehirler.get(2));
	}

}
