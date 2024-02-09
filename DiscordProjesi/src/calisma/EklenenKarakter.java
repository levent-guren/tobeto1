package calisma;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EklenenKarakter {
	static List<Character> character = new ArrayList<>();

	public static void main(String[] args) {
		String s = "abab";
		String t = "bcaba";
		Optional<Character> sonuc = checkStrings(t, s);
		if (sonuc.isPresent()) {
			System.out.println("Eklenen karakter: " + sonuc.get());
		} else {
			System.out.println("Eklenen bir karakter bulunamadı");
		}
	}

	public static Optional<Character> checkStrings(String t, String s) {
		for (int i = 0; i < s.length(); i++) {
			// System.out.println(s.charAt(i));
			character.add(s.charAt(i));
		}
		for (int i = 0; i < t.length(); i++) {
			// System.out.println(i);
			if (character.contains(t.charAt(i))) {
				character.remove(Character.valueOf(t.charAt(i)));
			} else {
				return Optional.of(t.charAt(i));
			}
		}
		return Optional.empty();
	}
}