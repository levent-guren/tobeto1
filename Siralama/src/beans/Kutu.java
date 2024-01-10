package beans;

public class Kutu implements Kiyaslanabilir {
	private int misketSayisi;

	public int getMisketSayisi() {
		return misketSayisi;
	}

	public void setMisketSayisi(int misketSayisi) {
		this.misketSayisi = misketSayisi;
	}

	public Kutu(int misketSayisi) {
		this.misketSayisi = misketSayisi;
	}

	@Override
	public String toString() {
		return "Kutu [misketSayisi=" + misketSayisi + "]";
	}

	@Override
	public int kiyasla(Kiyaslanabilir o) {
		Kutu kutu = (Kutu) o;
		if (getMisketSayisi() > kutu.getMisketSayisi()) {
			return -1;
		} else if (getMisketSayisi() < kutu.getMisketSayisi()) {
			return 1;
		} else {
			return 0;
		}
	}

}
