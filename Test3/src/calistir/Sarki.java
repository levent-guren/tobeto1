package calistir;

public class Sarki {
	private String adi;
	private double sure;

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public double getSure() {
		return sure;
	}

	public void setSure(double sure) {
		this.sure = sure;
	}

	public Sarki() {
	}

	public Sarki(String adi, double sure) {
		this.adi = adi;
		this.sure = sure;
	}

	@Override
	public String toString() {
		return "Sarki [adi=" + adi + ", sure=" + sure + "]";
	}

}
