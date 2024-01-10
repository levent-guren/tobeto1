package beans;

public abstract class Araba {
	private int hiz;
	private int vites;

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	@Override
	public String toString() {
		return "Araba [hiz=" + hiz + ", vites=" + vites + "], bakım km="
				+ getBakimKm();
	}

	public abstract int getBakimKm();
}
