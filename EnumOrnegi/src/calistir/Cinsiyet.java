package calistir;

public enum Cinsiyet {
	KADIN, ERKEK;

	public String getAdi() {
		if (this == KADIN) {
			return "Kadın";
		} else {
			return "Erkek";
		}
	}
}
