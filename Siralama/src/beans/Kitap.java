package beans;

public class Kitap implements Kiyaslanabilir {
	private int sayfaSayisi;

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	public Kitap(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	@Override
	public String toString() {
		return "Kitap [sayfaSayisi=" + sayfaSayisi + "]";
	}

	@Override
	public int kiyasla(Kiyaslanabilir o) {
		Kitap kitap = (Kitap) o;
		if (getSayfaSayisi() > kitap.getSayfaSayisi()) {
			return 1;
		} else if (getSayfaSayisi() < kitap.getSayfaSayisi()) {
			return -1;
		} else {
			return 0;
		}
	}

}
