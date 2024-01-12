package beans;

public class Motosiklet {
	private String marka;
	private int fiyat;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getFiyat() {
		return fiyat;
	}

	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}

	@Override
	public String toString() {
		return "Motosiklet [marka=" + marka + ", fiyat=" + fiyat + "]";
	}

	public Motosiklet() {
		System.out.println("Motosiklet sınıfının instance'i yaratiliyor.");
	}

}
